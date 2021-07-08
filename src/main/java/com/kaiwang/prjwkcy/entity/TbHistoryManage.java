package com.kaiwang.prjwkcy.entity;

import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Erupt(name = "评估历史管理",
        dataProxy = {TbHistoryManage.class})
@Table(name = "historymanage")
@Entity
@Component
public class TbHistoryManage extends BaseModel implements DataProxy<TbHistoryManage> {
    @EruptField(
            views = @View(title = "序号",
                    sortable = true),
            edit = @Edit(title = "序号",
                    search = @Search(
                            vague = true
                    ))
    )
    private String No;
    @EruptField(
            views = @View(title = "课程编号",
                    sortable = true),
            edit = @Edit(title = "课程编号",
                    search = @Search(
                            vague = true
                    ))
    )
    private String Num;
    @EruptField(
            views = @View(title = "课程名称",
                    sortable = true),
            edit = @Edit(title = "课程名称",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @EruptField(
            views = @View(title = "开课老师",
                    sortable = true),
            edit = @Edit(title = "开课老师",
                    search = @Search(
                            vague = true
                    ))
    )
    private String teacher;
    @EruptField(
            views = @View(title = "评价总分",
                    sortable = true),
            edit = @Edit(title = "评价总分",
                    search = @Search(
                            vague = true
                    ))
    )
    private String grade;
    @EruptField(
            views = @View(title = "操作时间",
                    sortable = true),
            edit = @Edit(title = "操作时间",
                    search = @Search)
    )
    private Date beginTime;
    @EruptField(
            views = @View(title = "建立IP",
                    sortable = true),
            edit = @Edit(title = "建立IP",
                    search = @Search)
    )
    private String ip;
}
