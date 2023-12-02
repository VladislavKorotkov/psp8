package com.bsuir.controller;

import com.bsuir.service.SortService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input = request.getParameter("numbers");

        if (!isValidInput(input)) {
            response.sendRedirect("error");
            return;
        }
        String sortOrder = request.getParameter("sortOrder");
        int[] numbers = SortService.sortNumbers(input, sortOrder);

        request.setAttribute("numbers", numbers);
        request.getRequestDispatcher("sort.jsp").forward(request, response);

    }

    private boolean isValidInput(String input) {
        return Pattern.matches("^\\d+(, \\d+)*$", input);
    }
}