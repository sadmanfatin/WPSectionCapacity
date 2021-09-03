package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 26 11:45:42 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpSectionCapacityEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SectionCapacityId {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getSectionCapacityId();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setSectionCapacityId((Number)value);
            }
        }
        ,
        WpSectionId {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getWpSectionId();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setWpSectionId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getStartDate();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getEndDate();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        MachineOperatorCount {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getMachineOperatorCount();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setMachineOperatorCount((Number)value);
            }
        }
        ,
        Hour {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getHour();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setHour((Number)value);
            }
        }
        ,
        Efficiency {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getEfficiency();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setEfficiency((Number)value);
            }
        }
        ,
        Capacity {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getCapacity();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setCapacity((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        CurrentCapacity {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getCurrentCapacity();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setCurrentCapacity((String)value);
            }
        }
        ,
        LastCurrentRowSectionId {
            public Object get(WpSectionCapacityEOImpl obj) {
                return obj.getLastCurrentRowSectionId();
            }

            public void put(WpSectionCapacityEOImpl obj, Object value) {
                obj.setLastCurrentRowSectionId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpSectionCapacityEOImpl object);

        public abstract void put(WpSectionCapacityEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int SECTIONCAPACITYID = AttributesEnum.SectionCapacityId.index();
    public static final int WPSECTIONID = AttributesEnum.WpSectionId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int MACHINEOPERATORCOUNT = AttributesEnum.MachineOperatorCount.index();
    public static final int HOUR = AttributesEnum.Hour.index();
    public static final int EFFICIENCY = AttributesEnum.Efficiency.index();
    public static final int CAPACITY = AttributesEnum.Capacity.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int CURRENTCAPACITY = AttributesEnum.CurrentCapacity.index();
    public static final int LASTCURRENTROWSECTIONID = AttributesEnum.LastCurrentRowSectionId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpSectionCapacityEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpSectionCapacityEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for SectionCapacityId, using the alias name SectionCapacityId.
     * @return the SectionCapacityId
     */
    public Number getSectionCapacityId() {
        return (Number)getAttributeInternal(SECTIONCAPACITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SectionCapacityId.
     * @param value value to set the SectionCapacityId
     */
    public void setSectionCapacityId(Number value) {
        setAttributeInternal(SECTIONCAPACITYID, value);
    }

    /**
     * Gets the attribute value for WpSectionId, using the alias name WpSectionId.
     * @return the WpSectionId
     */
    public Number getWpSectionId() {
        return (Number)getAttributeInternal(WPSECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WpSectionId.
     * @param value value to set the WpSectionId
     */
    public void setWpSectionId(Number value) {
        setAttributeInternal(WPSECTIONID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for MachineOperatorCount, using the alias name MachineOperatorCount.
     * @return the MachineOperatorCount
     */
    public Number getMachineOperatorCount() {
        return (Number)getAttributeInternal(MACHINEOPERATORCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for MachineOperatorCount.
     * @param value value to set the MachineOperatorCount
     */
    public void setMachineOperatorCount(Number value) {
        setAttributeInternal(MACHINEOPERATORCOUNT, value);
    }

    /**
     * Gets the attribute value for Hour, using the alias name Hour.
     * @return the Hour
     */
    public Number getHour() {
        return (Number)getAttributeInternal(HOUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Hour.
     * @param value value to set the Hour
     */
    public void setHour(Number value) {
        setAttributeInternal(HOUR, value);
    }

    /**
     * Gets the attribute value for Efficiency, using the alias name Efficiency.
     * @return the Efficiency
     */
    public Number getEfficiency() {
        return (Number)getAttributeInternal(EFFICIENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Efficiency.
     * @param value value to set the Efficiency
     */
    public void setEfficiency(Number value) {
        setAttributeInternal(EFFICIENCY, value);
    }

    /**
     * Gets the attribute value for Capacity, using the alias name Capacity.
     * @return the Capacity
     */
    public Number getCapacity() {
        System.out.println("eo impl get capacity");
        return (Number)getAttributeInternal(CAPACITY);
             
    }

    /**
     * Sets <code>value</code> as the attribute value for Capacity.
     * @param value value to set the Capacity
     */
    public void setCapacity(Number value) {
        setAttributeInternal(CAPACITY, value);
        
        System.out.println("eo impl set capacity");
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }


    /**
     * Gets the attribute value for CurrentCapacity, using the alias name CurrentCapacity.
     * @return the CurrentCapacity
     */
    public String getCurrentCapacity() {
        return (String)getAttributeInternal(CURRENTCAPACITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentCapacity.
     * @param value value to set the CurrentCapacity
     */
    public void setCurrentCapacity(String value) {
        setAttributeInternal(CURRENTCAPACITY, value);
    }

    /**
     * Gets the attribute value for LastCurrentRowSectionId, using the alias name LastCurrentRowSectionId.
     * @return the LastCurrentRowSectionId
     */
    public Number getLastCurrentRowSectionId() {
        return (Number)getAttributeInternal(LASTCURRENTROWSECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastCurrentRowSectionId.
     * @param value value to set the LastCurrentRowSectionId
     */
    public void setLastCurrentRowSectionId(Number value) {
        setAttributeInternal(LASTCURRENTROWSECTIONID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param sectionCapacityId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number sectionCapacityId) {
        return new Key(new Object[]{sectionCapacityId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         
         Map sessionScope = ADFContext.getCurrent().getSessionScope();
            String orgId = (String)sessionScope.get("orgId");
         
            super.create(attributeList);
            
//            try {
//                
//                this.setOrgId(new Number(orgId));
//                
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
            
             oracle.jbo.server.SequenceImpl s =
             new oracle.jbo.server.SequenceImpl("WP_SECTION_CAPACITY_SEQ",  getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
             this.setSectionCapacityId(sVal);
             
             
           /*
              when a new row is created, it will be current Capacity row, but when it  will be inserted 
              other currnet capacity row set by other user in the mean time will be set 'n' in the trigger
            */
             
               this.setCurrentCapacity("y");  
          

     }

     /**
      * Add locking logic here.
      */
     public void lock() {
         super.lock();
     }

     /**
      * Custom DML update/insert/delete logic here.
      * @param operation the operation type
      * @param e the transaction event
      */
     protected void doDML(int operation, TransactionEvent e) {
         Map sessionScope = ADFContext.getCurrent().getSessionScope();
              String user = (String)sessionScope.get("userId");
              
         //        System.out.println("Document No -->" + getSrNoString());
               
              if (DML_UPDATE == operation) {
                  try {
                      setLastUpdatedDate((Date)Date.getCurrentDate());
                      setLastUpdatedBy(new oracle.jbo.domain.Number(user));              
                      
                  } catch (SQLException f) {
                      f.printStackTrace();
                  }
              } else if (DML_INSERT == operation) {

                  try {
                    
                      setCreationDate((Date)Date.getCurrentDate());
                      setCreatedBy(new oracle.jbo.domain.Number(user));

                  } catch (SQLException f) {
                      f.printStackTrace();
                  }
              }
              
          
         super.doDML(operation, e);
     }
}
