package model.view;

import java.sql.SQLException;

import model.entity.WpSectionCapacityEOImpl;

import oracle.jbo.Row;
import oracle.jbo.domain.ClobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 26 11:45:32 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpSectionCapacityVORowImpl extends ViewRowImpl {


    private Number getUpdatedCapacity() {
        
        double capacity = 0.0 ;
        
        
        try {
            capacity = this.getHour().doubleValue()*60*this.getMachineOperatorCount().doubleValue()*this.getEfficiency().doubleValue();
            return new Number(capacity);
        } catch (Exception e) {
            // TODO: Add catch code
           return null;
            
          
        }
   
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SectionCapacityId {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getSectionCapacityId();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setSectionCapacityId((Number)value);
            }
        }
        ,
        WpSectionId {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getWpSectionId();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setWpSectionId((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        MachineOperatorCount {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getMachineOperatorCount();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setMachineOperatorCount((Number)value);
            }
        }
        ,
        Hour {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getHour();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setHour((Number)value);
            }
        }
        ,
        Efficiency {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getEfficiency();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setEfficiency((Number)value);
            }
        }
        ,
        Capacity {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getCapacity();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setCapacity((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        OrgId {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        CurrentSectionCapacityVO {
            public Object get(WpSectionCapacityVORowImpl obj) {
                return obj.getCurrentSectionCapacityVO();
            }

            public void put(WpSectionCapacityVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpSectionCapacityVORowImpl object);

        public abstract void put(WpSectionCapacityVORowImpl object,
                                 Object value);

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
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CURRENTSECTIONCAPACITYVO = AttributesEnum.CurrentSectionCapacityVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpSectionCapacityVORowImpl() {
    }

    /**
     * Gets WpSectionCapacityEO entity object.
     * @return the WpSectionCapacityEO
     */
    public WpSectionCapacityEOImpl getWpSectionCapacityEO() {
        return (WpSectionCapacityEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for SECTION_CAPACITY_ID using the alias name SectionCapacityId.
     * @return the SECTION_CAPACITY_ID
     */
    public Number getSectionCapacityId() {
        return (Number) getAttributeInternal(SECTIONCAPACITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for SECTION_CAPACITY_ID using the alias name SectionCapacityId.
     * @param value value to set the SECTION_CAPACITY_ID
     */
    public void setSectionCapacityId(Number value) {
        setAttributeInternal(SECTIONCAPACITYID, value);
    }

    /**
     * Gets the attribute value for WP_SECTION_ID using the alias name WpSectionId.
     * @return the WP_SECTION_ID
     */
    public Number getWpSectionId() {
        return (Number) getAttributeInternal(WPSECTIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for WP_SECTION_ID using the alias name WpSectionId.
     * @param value value to set the WP_SECTION_ID
     */
    public void setWpSectionId(Number value) {
        setAttributeInternal(WPSECTIONID, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for MACHINE_OPERATOR_COUNT using the alias name MachineOperatorCount.
     * @return the MACHINE_OPERATOR_COUNT
     */
    public Number getMachineOperatorCount() {
        return (Number) getAttributeInternal(MACHINEOPERATORCOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for MACHINE_OPERATOR_COUNT using the alias name MachineOperatorCount.
     * @param value value to set the MACHINE_OPERATOR_COUNT
     */
    public void setMachineOperatorCount(Number value) {
        setAttributeInternal(MACHINEOPERATORCOUNT, value);
        setCapacity(this.getUpdatedCapacity());
    }

    /**
     * Gets the attribute value for HOUR using the alias name Hour.
     * @return the HOUR
     */
    public Number getHour() {
        return (Number) getAttributeInternal(HOUR);
    }

    /**
     * Sets <code>value</code> as attribute value for HOUR using the alias name Hour.
     * @param value value to set the HOUR
     */
    public void setHour(Number value) {
        
    
        setAttributeInternal(HOUR, value);
        
       setCapacity(getUpdatedCapacity());
        
    }

    /**
     * Gets the attribute value for EFFICIENCY using the alias name Efficiency.
     * @return the EFFICIENCY
     */
    public Number getEfficiency() {
        return (Number) getAttributeInternal(EFFICIENCY);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFICIENCY using the alias name Efficiency.
     * @param value value to set the EFFICIENCY
     */
    public void setEfficiency(Number value) {
        setAttributeInternal(EFFICIENCY, value);
        setCapacity(this.getUpdatedCapacity());
    }

    /**
     * Gets the attribute value for CAPACITY using the alias name Capacity.
     * @return the CAPACITY
     */
    public Number getCapacity() {        
      
      
      return (Number) getAttributeInternal(CAPACITY);

    }

    /**
     * Sets <code>value</code> as attribute value for CAPACITY using the alias name Capacity.
     * @param value value to set the CAPACITY
     */
    public void setCapacity(Number value) {
        setAttributeInternal(CAPACITY, value);
        System.out.println("vo impl set capacity");
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link CurrentSectionCapacityVO.
     */
    public Row getCurrentSectionCapacityVO() {
        return (Row)getAttributeInternal(CURRENTSECTIONCAPACITYVO);
    }

    /**
     * Sets the master-detail link CurrentSectionCapacityVO between this object and <code>value</code>.
     */
    public void setCurrentSectionCapacityVO(Row value) {
        setAttributeInternal(CURRENTSECTIONCAPACITYVO, value);
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
    
    
}
