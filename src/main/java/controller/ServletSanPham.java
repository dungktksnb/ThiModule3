package controller;

import daos.CRUDSanPham;
import modules.SanPham;
import services.ManageSanPham;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletSanPham", value = "/home")
public class ServletSanPham extends HttpServlet {
    RequestDispatcher requestDispatcher;
    ManageSanPham manageSanPham = new ManageSanPham();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "create":
                response.sendRedirect("/views/createSanPham.jsp");

                break;
            case "delete":
                int index = Integer.parseInt(request.getParameter("index"));
                try {
                    manageSanPham.delete(index);
                    request.setAttribute("listSanPham", CRUDSanPham.showSanPham());
                    requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                    requestDispatcher.forward(request, response);
                } catch (Exception throwables) {
                    throwables.printStackTrace();
                }
                break;
            case "edit":
//                response.sendRedirect("views/editProduct.jsp");
                try {
                    int indexedit= Integer.parseInt(request.getParameter("index"));
                    request.setAttribute("SanPham", CRUDSanPham.showSanPham().get(indexedit));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/edit.jsp");
                requestDispatcher.forward(request, response);
            default:
                try {
                    request.setAttribute("listSanPham", CRUDSanPham.showSanPham());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                requestDispatcher.forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                int maSanPham = Integer.parseInt(request.getParameter("masanpham"));
                String tenSanPham = request.getParameter("tensanpham");
                double giaSanPham = Double.parseDouble(request.getParameter("giasanpham"));
                int soLuong = Integer.parseInt(request.getParameter("soluong"));
                String mauSac = request.getParameter("mausac");
                String moTa = request.getParameter("mota");
                int danhMuc = Integer.parseInt(request.getParameter("danhmuc"));
                SanPham sanPham = new SanPham(maSanPham, tenSanPham, giaSanPham, soLuong, mauSac, moTa, danhMuc);
                try {
                    manageSanPham.save(sanPham);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                response.sendRedirect("/home");

                try {
                    manageSanPham.save(sanPham);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                int maSanPham1 = Integer.parseInt(request.getParameter("masanpham"));
                String tenSanPham1 = request.getParameter("tensanpham");
                double giaSanPham1 = Double.parseDouble(request.getParameter("gia"));
                int soLuong1 = Integer.parseInt(request.getParameter("soluong"));
                String mauSac1 = request.getParameter("mausac");
                String moTa1 = request.getParameter("mota");
                int danhMuc1 = Integer.parseInt(request.getParameter("danhmuc"));
                SanPham sanPham1 = new SanPham(maSanPham1, tenSanPham1, giaSanPham1, soLuong1, mauSac1, moTa1, danhMuc1);

                    int indexedit = Integer.parseInt(request.getParameter("index"));
                try {
                    manageSanPham.edit(sanPham1,indexedit);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                response.sendRedirect("/home");

                break;
            case "delete":
                int index = Integer.parseInt(request.getParameter("index"));
                try {
                    manageSanPham.delete(index);
                    request.setAttribute("listProduct", CRUDSanPham.showSanPham());
                    requestDispatcher = request.getRequestDispatcher("views/homes.jsp");
                    requestDispatcher.forward(request, response);
                } catch (Exception throwables) {
                    throwables.printStackTrace();
                }
                break;

        }

    }
}
