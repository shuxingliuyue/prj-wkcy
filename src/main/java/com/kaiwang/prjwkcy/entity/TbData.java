package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.upms.model.EruptOrg;
import xyz.erupt.upms.model.EruptUser;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "考试公告表",
        dataProxy = {TbData.class})
@Table(name = "data")
@Entity
@Component
public class TbData implements DataProxy<TbData> {
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;

    @EruptField(
            views = @View(title = "考试公告",
                    sortable = true),
            edit = @Edit(title = "考试公告",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @EruptField(
            views = @View(title = "参加考试时间",
                    sortable = true),
            edit = @Edit(title = "参加考试时间",
                    search = @Search)
    )
    private Date beginTime;

    @EruptField(
            views = @View(title = "成绩",
                    sortable = true),
            edit = @Edit(title = "成绩",
                    search = @Search)
    )
    private String score;


}
