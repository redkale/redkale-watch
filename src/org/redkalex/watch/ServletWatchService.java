/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkalex.watch;

import javax.annotation.Resource;
import org.redkale.boot.Application;
import org.redkale.net.TransportFactory;
import org.redkale.net.http.*;
import org.redkale.service.RetResult;
import org.redkale.watch.WatchService;

/**
 * <p>
 * 详情见: https://redkale.org
 *
 * @author zhangjx
 */
@RestService(name = "servlet", catalog = "watch", repair = false)
public class ServletWatchService implements WatchService {

    @Resource
    private Application application;

    @Resource
    private TransportFactory transportFactory;

    @RestMapping(name = "load", auth = false, comment = "动态增加Servlet")
    public RetResult loadServlet(String type, @RestUploadFile(maxLength = 10 * 1024 * 1024, fileNameReg = "\\.jar$") byte[] jar) {
        //待开发
        return RetResult.success();
    }

    @RestMapping(name = "stop", auth = false, comment = "动态停止Servlet")
    public RetResult stopServlet(String type) {
        //待开发
        return RetResult.success();
    }
}
