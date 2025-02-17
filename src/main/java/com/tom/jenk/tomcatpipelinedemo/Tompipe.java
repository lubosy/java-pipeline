package com.tom.jenk.tomcatpipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tompipe {

    @GetMapping("text")
    public String getText(){
        return "Jenkins CI CD Complete";
    }

    @GetMapping("text/tool")
    public String getDemo(){
        return "Jenkins CI CD Demo..";
    }

    @GetMapping("text/v1/tool")
    public String getDemo2(){
        return "Jenkins CI CD Demo 2..";
    }

    @GetMapping("deploy/test")
    public String DeployToUat(){
        return "<h1>Deployment to uat successful..</h1>";
    }

    @GetMapping("deploy/test/tpd")
    public String DeployToUatLocal(){
        return "<h1>Deployment to uat successful..Using a Pipeline</h1>";
    }

}
