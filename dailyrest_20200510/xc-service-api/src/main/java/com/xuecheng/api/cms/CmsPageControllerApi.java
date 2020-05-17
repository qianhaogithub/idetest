package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author qianhao
 * @create 2020/5/10-16:56
 */
public interface CmsPageControllerApi {

    QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
