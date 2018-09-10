package com.lou.model;

import lombok.*;

/**
 * @author loufeng
 * @date 2018/9/7 下午2:46
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShareDO {
    /**
     * 记录id
     */
    private Integer id;
    /**
     * 分享id
     */
    private String shareId;
    /**
     * 集团id
     */
    private Integer siteId;
    /**
     * 用户uid
     */
    private String uId;
    /**
     * 用户手机号
     */
    private String salerPhone;
    /**
     * 分享标题
     */
    private String title;
    /**
     * 分享链接
     */
    private String shareLink;
    /**
     * 分享图标
     */
    private String iconLink;
    /**
     * 分享类型
     */
    private Integer shareType;
    /**
     * 有效状态
     */
    private Boolean status;
}