package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDaoImpl implements BlogDaoInterface{

	public static final String INSERT_BLOG_SQL = "INSERT INTO BLOG(blogId,blogTitle,blogDescription,postedOn)VALUES(?,?,?,?)";
	
	public void insertBlog(Blog blog) throws IOException {
	try {
		Connection con = ConnectionManager.getConnection();
		PreparedStatement st = con.prepareStatement(INSERT_BLOG_SQL);
		st.setInt(1, blog.getBlogId());
		st.setString(2, blog.getBlogTitle());
		st.setString(3, blog.getBlogDescription());
		st.setDate(4, java.sql.Date.valueOf(blog.getPostedOn()));
		st.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}

	public Blog selectBLog(int blogId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> selectAllBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteBlog(int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		return false;
	}

}
