package model.view;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 02 10:17:33 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CurrentSectionCapacityVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SectionCapacityId {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getSectionCapacityId();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setSectionCapacityId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        SectionName {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getSectionName();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setSectionName((String)value);
            }
        }
        ,
        WpSectionId {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getWpSectionId();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setWpSectionId((Number)value);
            }
        }
        ,
        StartDate {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getStartDate();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getEndDate();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        Hour {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getHour();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setHour((Number)value);
            }
        }
        ,
        MachineOperatorCount {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getMachineOperatorCount();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setMachineOperatorCount((Number)value);
            }
        }
        ,
        Efficiency {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getEfficiency();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setEfficiency((Number)value);
            }
        }
        ,
        Capacity {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getCapacity();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setCapacity((Number)value);
            }
        }
        ,
        OrgVO {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getOrgVO();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        WpSectionCapacityVO {
            public Object get(CurrentSectionCapacityVORowImpl obj) {
                return obj.getWpSectionCapacityVO();
            }

            public void put(CurrentSectionCapacityVORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CurrentSectionCapacityVORowImpl object);

        public abstract void put(CurrentSectionCapacityVORowImpl object,
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
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SECTIONNAME = AttributesEnum.SectionName.index();
    public static final int WPSECTIONID = AttributesEnum.WpSectionId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int HOUR = AttributesEnum.Hour.index();
    public static final int MACHINEOPERATORCOUNT = AttributesEnum.MachineOperatorCount.index();
    public static final int EFFICIENCY = AttributesEnum.Efficiency.index();
    public static final int CAPACITY = AttributesEnum.Capacity.index();
    public static final int ORGVO = AttributesEnum.OrgVO.index();
    public static final int WPSECTIONCAPACITYVO = AttributesEnum.WpSectionCapacityVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CurrentSectionCapacityVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SectionCapacityId.
     * @return the SectionCapacityId
     */
    public Number getSectionCapacityId() {
        return (Number) getAttributeInternal(SECTIONCAPACITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SectionCapacityId.
     * @param value value to set the  SectionCapacityId
     */
    public void setSectionCapacityId(Number value) {
        setAttributeInternal(SECTIONCAPACITYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SectionName.
     * @return the SectionName
     */
    public String getSectionName() {
        return (String) getAttributeInternal(SECTIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SectionName.
     * @param value value to set the  SectionName
     */
    public void setSectionName(String value) {
        setAttributeInternal(SECTIONNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WpSectionId.
     * @return the WpSectionId
     */
    public Number getWpSectionId() {
        return (Number) getAttributeInternal(WPSECTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WpSectionId.
     * @param value value to set the  WpSectionId
     */
    public void setWpSectionId(Number value) {
        setAttributeInternal(WPSECTIONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StartDate.
     * @param value value to set the  StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EndDate.
     * @param value value to set the  EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Hour.
     * @return the Hour
     */
    public Number getHour() {
        return (Number) getAttributeInternal(HOUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Hour.
     * @param value value to set the  Hour
     */
    public void setHour(Number value) {
        setAttributeInternal(HOUR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MachineOperatorCount.
     * @return the MachineOperatorCount
     */
    public Number getMachineOperatorCount() {
        return (Number) getAttributeInternal(MACHINEOPERATORCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MachineOperatorCount.
     * @param value value to set the  MachineOperatorCount
     */
    public void setMachineOperatorCount(Number value) {
        setAttributeInternal(MACHINEOPERATORCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Efficiency.
     * @return the Efficiency
     */
    public Number getEfficiency() {
        return (Number) getAttributeInternal(EFFICIENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Efficiency.
     * @param value value to set the  Efficiency
     */
    public void setEfficiency(Number value) {
        setAttributeInternal(EFFICIENCY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Capacity.
     * @return the Capacity
     */
    public Number getCapacity() {
        return (Number) getAttributeInternal(CAPACITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Capacity.
     * @param value value to set the  Capacity
     */
    public void setCapacity(Number value) {
        setAttributeInternal(CAPACITY, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link OrgVO.
     */
    public Row getOrgVO() {
        return (Row)getAttributeInternal(ORGVO);
    }

    /**
     * Sets the master-detail link OrgVO between this object and <code>value</code>.
     */
    public void setOrgVO(Row value) {
        setAttributeInternal(ORGVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link WpSectionCapacityVO.
     */
    public RowIterator getWpSectionCapacityVO() {
        return (RowIterator)getAttributeInternal(WPSECTIONCAPACITYVO);
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
