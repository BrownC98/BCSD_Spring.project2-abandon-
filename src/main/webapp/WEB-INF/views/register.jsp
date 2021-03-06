<%--<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=utf-8" %>
<head>
    <title>Register</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="../resources/Login_v14/images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css"
          href="../resources/Login_v14/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css"
          href="../resources/Login_v14/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/css/util.css">
    <link rel="stylesheet" type="text/css" href="../resources/Login_v14/css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100 p-l-85 p-r-85 p-t-55 p-b-55">
            <form class="login100-form validate-form flex-sb flex-w" action="<c:url value="/register"/>" method="post">
					<span class="login100-form-title p-b-32">
						회    원    가    입
					</span>

                <span class="txt1 p-b-11">
						E-mail
					</span>
                <div class="wrap-input100 validate-input m-b-36" data-validate="Username is required">
                    <input class="input100" type="text" name="userEmail">
                    <span class="focus-input100"></span>
                </div>
                <span class="txt1 p-b-11">
						Password
					</span>
                <div class="wrap-input100 validate-input m-b-12" data-validate="Password is required">
						<span class="btn-show-pass">
							<i class="fa fa-eye"></i>
						</span>
                    <input class="input100" type="password" name="userPassword">
                    <span class="focus-input100"></span>
                </div>
                <div class="container-login100-form-btn">
                    <button class="login100-form-btn" type="submit">
                        Register
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>


<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/bootstrap/js/popper.js"></script>
<script src="../resources/Login_v14/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/daterangepicker/moment.min.js"></script>
<script src="../resources/Login_v14/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="../resources/Login_v14/js/main.js"></script>
<%--<script>--%>
<%--    var msg = "${msg}";--%>
<%--    if(msg === "가입완료"){--%>
<%--        alert("회원가입이 완료되었습니다.");--%>
<%--    } else {--%>
<%--        alert("아이디와 비밀번호를 확인해주세요");--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>