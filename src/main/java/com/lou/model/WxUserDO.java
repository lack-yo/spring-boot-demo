package com.lou.model;

import lombok.*;

/**
 * @author loufeng
 * @date 2018/9/13 下午2:40
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxUserDO {
    private int id;
    private String openId;
    private String appId;
    private String unionId;
    private String nickname;
    private String headImgUrl;
    private String city;
    private String country;
    private String province;
    private int sex;
    private String language;
}