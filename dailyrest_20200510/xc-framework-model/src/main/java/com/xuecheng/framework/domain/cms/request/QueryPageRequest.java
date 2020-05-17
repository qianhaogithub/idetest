package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author qianhao
 * @create 2020/5/10-16:47
 */
@Data
public class QueryPageRequest extends RequestData {
    private String siteId;//站点Id
    private String pageId;//页面Id
    private String pageName;//页面名称
    private String pageAliase;//别名
    private String templateId;//模板id
}
