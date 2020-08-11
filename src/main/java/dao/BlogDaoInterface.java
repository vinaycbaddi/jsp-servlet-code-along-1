package dao;

import java.io.IOException;
import java.util.List;

import model.Blog;

public interface BlogDaoInterface {
	void insertBlog(Blog blog) throws IOException;
	Blog selectBLog(int blogId);
	List<Blog>selectAllBlogs();
	boolean deleteBlog(int blogId);
	boolean updateBlog(Blog blog);
}
