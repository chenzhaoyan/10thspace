package com.tenth.space.DB.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import com.tenth.space.imservice.entity.SearchElement;
import com.tenth.space.utils.pinyin.PinYin;
// KEEP INCLUDES END
/**
 * Entity mapped to table Department.
 */
public class DepartmentEntity {

    private Long id;
    private int departId;
    /** Not-null value. */
    private String departName;
    private int priority;
    private int status;
    private int created;
    private int updated;

    // KEEP FIELDS - put your custom fields here
    private PinYin.PinYinElement pinyinElement = new PinYin.PinYinElement();
    private SearchElement searchElement = new SearchElement();
    // KEEP FIELDS END

    public DepartmentEntity() {
    }

    public DepartmentEntity(Long id) {
        this.id = id;
    }

    public DepartmentEntity(Long id, int departId, String departName, int priority, int status, int created, int updated) {
        this.id = id;
        this.departId = departId;
        this.departName = departName;
        this.priority = priority;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDepartId() {
        return departId;
    }

    public void setDepartId(int departId) {
        this.departId = departId;
    }

    /** Not-null value. */
    public String getDepartName() {
        return departName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    // KEEP METHODS - put your custom methods here

    public PinYin.PinYinElement getPinyinElement() {
        return pinyinElement;
    }

    public SearchElement getSearchElement() {
        return searchElement;
    }
    // KEEP METHODS END

}