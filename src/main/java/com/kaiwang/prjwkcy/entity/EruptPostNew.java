
package com.kaiwang.prjwkcy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

@Entity
@Table(
        name = "e_upms_post",
        uniqueConstraints = {@UniqueConstraint(
                columnNames = {"code"}
        )}
)
@Erupt(
        name = "用户岗位",
        orderBy = "weight desc"
)
public class EruptPostNew extends BaseModel {
    @EruptField(
            views = {@View(
                    title = "岗位编码"
            )},
            edit = @Edit(
                    title = "岗位编码",
                    notNull = true,
                    search = @Search
            )
    )
    private String code;
    @EruptField(
            views = {@View(
                    title = "岗位名称"
            )},
            edit = @Edit(
                    title = "岗位名称",
                    notNull = true,
                    search = @Search
            )
    )
    private String name;
    @EruptField(
            views = {@View(
                    title = "岗位权重"
            )},
            edit = @Edit(
                    title = "岗位权重",
                    desc = "数值越高，岗位级别越高",
                    notNull = true
            )
    )
    private Integer weight;

    public EruptPostNew() {
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setWeight(final Integer weight) {
        this.weight = weight;
    }
}
