import javax.faces.event.ActionEvent;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class ManagedBean {
    private RichTable currentSectionCapacityTable;

    public ManagedBean() {
    }
   AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }
    
    
    

    public void save(ActionEvent actionEvent) {
        // Add event code here...
        this.executeOperation("Commit");
        
        this.refreshQueryKeepingCurrentRow(appM.getCurrentSectionCapacityVO1());
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.currentSectionCapacityTable);
        
    }
    
    private void executeOperation(String method) {
        BindingContainer bindings = getBindings();
               OperationBinding ob = bindings.getOperationBinding(method);
        Object result = ob.execute();
        
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


    public void setCurrentSectionCapacityTable(RichTable currentSectionCapacityTable) {
        this.currentSectionCapacityTable = currentSectionCapacityTable;
    }

    public RichTable getCurrentSectionCapacityTable() {
        return currentSectionCapacityTable;
    }
    
    
    public void refreshQueryKeepingCurrentRow(ViewObject viewObject )  {
        
        
         Row currentRow;
         Key currentRowKey;
         
         // added on 7.jan.18 to handle exception if view object has no current row
        try{
           currentRow = viewObject.getCurrentRow();
           currentRowKey = currentRow.getKey();
        }
        catch(Exception e){
            return;
        }
        
     
       
      
       int rangePosOfCurrentRow = viewObject.getRangeIndexOf(currentRow);
       int rangeStartBeforeQuery = viewObject.getRangeStart();
       viewObject.executeQuery();
       viewObject.setRangeStart(rangeStartBeforeQuery);
       /*
        * In 10.1.2, there is this convenience method we could use
        * instead of the remaining lines of code
        *
        *  findAndSetCurrentRowByKey(currentRowKey,rangePosOfCurrentRow);
        *  
        */
       
         
       Row[] rows = viewObject.findByKey(currentRowKey, 1);
       if (rows != null && rows.length == 1)
       {
          viewObject.scrollRangeTo(rows[0], rangePosOfCurrentRow);
          viewObject.setCurrentRowAtRangeIndex(viewObject.getRangeIndexOf(rows[0]));
       }
       
               
     }
    
}
