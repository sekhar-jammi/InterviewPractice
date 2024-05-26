package com.Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionInterviewQuestion_06 {

	public static void main(String[] args) {
		try {
            foo();
        } catch (IOException | SQLException e) {
            e = new Exception("");
            e.printStackTrace();
        }catch(Exception e){
            e = new Exception("");
            e.printStackTrace();
        }
    }

    public static void foo() throws IOException, SQLException{

	}

}
