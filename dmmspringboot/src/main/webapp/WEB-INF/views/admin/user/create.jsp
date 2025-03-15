<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Dashboard - SB Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
    <link href="/css/styles.css" rel="stylesheet" />
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
    <jsp:include page="../layout/header.jsp" />
    <div id="layoutSidenav">
        <jsp:include page="../layout/sidebar.jsp" />
        <div id="layoutSidenav_content">
            <main>
                <div class="container-fluid px-4">
                    <h1 class="mt-4">Dashboard</h1>
                    <ol class="breadcrumb mb-4">
                        <li class="breadcrumb-item active">Dashboard</li>
                        <li class="breadcrumb-item active">Product</li>
                    </ol>
                    <div class="container mt-5">
                        <div class="card shadow-lg">
                            <div class="card-header text-center bg-primary text-white">
                                <h4>Form Nhập Thông Tin</h4>
                            </div>
                            <div class="card-body">
                                <form:form modelAttribute="createdUser" action="/admin/user/created" method="POST" enctype="multipart/form-data">
                                    <div class="mb-3">
                                        <label for="email" class="form-label">Email</label>
                                        <form:input path="email" class="form-control" id="email" placeholder="Nhập email" required="true" />
                                    </div>

                                    <div class="mb-3">
                                        <label for="password" class="form-label">Mật khẩu</label>
                                        <form:input type="password" path="password" class="form-control" id="password" placeholder="Nhập mật khẩu" required="true" />
                                    </div>

                                    <div class="mb-3">
                                        <label for="fullname" class="form-label">Họ và tên</label>
                                        <form:input path="fullName" class="form-control" id="fullname" placeholder="Nhập họ và tên" required="true" />
                                    </div>

                                    <div class="mb-3">
                                        <label for="address" class="form-label">Địa chỉ</label>
                                        <form:input path="address" class="form-control" id="address" placeholder="Nhập địa chỉ" />
                                    </div>

                                    <div class="mb-3">
                                        <label for="role" class="form-label">Chức vụ</label>
                                        <form:select path="role.name" cssClass="form-select" id="role">
                                            <form:option value="admin">Admin</form:option>
                                            <form:option value="user">Người dùng</form:option>

                                        </form:select>
                                    </div>
                                    <div class="mb-3">
                                        <label for="fileUpload" class="form-label">Tải lên tập tin</label>
                                        <input type="file" class="form-control" id="fileUpload" name="tuanneFile" />
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-success">Đăng ký</button>
                                        <button type="reset" class="btn btn-secondary">Làm mới</button>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
            <jsp:include page="../layout/footer.jsp" />
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="js/scripts.js"></script>
</body>
</html>
