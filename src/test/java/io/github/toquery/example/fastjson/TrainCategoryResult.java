package io.github.toquery.example.fastjson;

import lombok.Data;

import java.util.List;

/**
 * <p>
 * 云课堂培训一级分类表
 * </p>
 *
 * @author guo
 * @since 2020-12-10
 */
@Data
public class TrainCategoryResult {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类显示图标
     */
    private String categoryLogo;

    /**
     * 父类主键id
     */
    private Long parentCategoryId;

    /**
     * 所有父类主键id
     */
    private String parentCategoryIds;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态（字典 0正常 1停用 2删除）
     */
    private Integer status;

    /**
     * 子节点
     */
    private List children;

    /**
     * 菜单层级
     */
    private Integer levels;

    /**
     * 备注
     */
    private String description;

}
