<style type="text/css">

    p.error {
        color: #DE5959;
    }

    .form-signin input[type="text"].error, .form-signin input[type="password"].error
    {
        border-color: #b94a48;
        color: #b94a48;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
    }

    input.error:focus {
        border-color: #953b39;
        color: #b94a48;
        -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px
        #d59392;
        box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0 0 6px #d59392;
    }
</style>
<#include "header.ftl">
<link rel="stylesheet" type="text/css" href="${TEMPLATE_BASE_PATH}/css/login.css"/>
<div class="login">
    <h2></h2>
    <div class="login-top">
        <h1>注册</h1>
        <form class="registerform"
              action="${BASE_PATH}/center/register.json"
              method="post">
            <input type="text" name="email" datatype="e" placeholder="用户名" value="chenrunfa@vip.qq.com" class="inputxt">
            <input type="password" name="password" datatype="*6-15" placeholder="密码" value="123456" class="inputxt">
            <input type="password" name="checkpassword" datatype="*6-15" recheck="password" placeholder="重复密码" value="123456" class="inputxt">
            <input type="text" name="captcha" class="form-control"
                   placeholder="验证码" style="width: 100px; float: left;height: 50px;"> <img
                id="captcha"
                style="cursor: pointer; cursor: hand; border-radius: 10px;"
                onclick="this.src='${BASE_PATH}/center/captcha.htm?'+Math.random();"
                src="${BASE_PATH}/center/captcha.htm">

            <div class="forgot">
                <a href="${BASE_PATH}/center/login.htm">前往登录</a>
                <input type="submit" value="注册" >
            </div>
            <div>
                <p class="error" ></p>
            </div>
        </form>
    </div>
  
</div>
<script type="text/javascript">

    $(function(){

        var demo=$(".registerform").Validform({
            tiptype:function(msg,o,cssctl){
                var objtip=$(".error");
                cssctl(objtip,o.type);
                objtip.text(msg);
            },
            callback:function(data){
                if(data.result){
                    window.location.href="/center/login.htm";
                }
                else{
                    console.log(data);
                    if (data.msg == "change_captcha") {
                        $('#captcha').attr("src", "${BASE_PATH}/center/captcha.htm?" + Math.random());
                        $('.registerform input[name="captcha"]').val('');

                    }
                    alert(data.errors.msg)
                }
            },
            ajaxPost:true
        });

    })

</script>
<#include "footer.ftl">