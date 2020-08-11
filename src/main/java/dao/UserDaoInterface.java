package dao;

import java.io.IOException;

import model.User;

public interface UserDaoInterface {
	int signup(User user) throws IOException;
	boolean loginUser(User user) throws IOException;
}
