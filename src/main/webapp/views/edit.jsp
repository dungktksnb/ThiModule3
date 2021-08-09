<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/9/2021
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/30/2021
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Create Account Table</h2>
    <form  method="post" >
        <table class="table">

            <tbody>
            <tr>
                <td><input placeholder="nhập Mã sản Phẩm" name="masanpham" value="${SanPham.maSanPham}" readonly></td>
                <td><input placeholder="nhập tên Sản Phẩm" name="tensanpham" value="${SanPham.tenSanPham }"></td>
                <td><input placeholder="nhập giá" name="gia" value="${SanPham.gia}"></td>
                <td><input placeholder="nhập số lượng" name="soluong"value="${SanPham.soLuong}"></td>
                <td><input placeholder="nhập màu sắc" name="mausac"value="${SanPham.mauSac}"></td>
                <td><input placeholder="nhập mô tả" name="mota"value="${SanPham.moTa}"></td>
                <td><input placeholder="nhập danh mục" name="danhmuc"value="${SanPham.danhMuc}"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" class="btn btn-success">Edit Account</button>

    </form>
</div>

</body>
</html>

