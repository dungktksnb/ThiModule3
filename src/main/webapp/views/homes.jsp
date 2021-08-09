<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 7/30/2021
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
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
    <h2>Show Sản phẩm</h2><br>
    <a href="/home?action=create" type="button" class="btn btn-success">Create</a><br>

    <table class="table"><br>
        <thead>
        <tr>
            <th>mã sản phẩm</th>
            <th>tên Sản phẩm</th>
            <th>giá</th>
            <th>số lượng</th>
            <th>màu sắc</th>
            <th>mô tả</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listSanPham}" var="sp" varStatus="loop">
            <tr>
                <td>${sp.maSanPham}</td>
                <td>${sp.tenSanPham}</td>
                <td>${sp.gia}</td>
                <td>${sp.soLuong}</td>
                <td>${sp.mauSac}</td>
                <td>${sp.moTa}</td>
                <td>${sp.danhMuc}</td>
                <td><a href="/home?action=edit&index=${loop.index}" class="btn btn-warning">Edit</a></td>
                <td><a href="/home?action=delete&index=${loop.index}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
