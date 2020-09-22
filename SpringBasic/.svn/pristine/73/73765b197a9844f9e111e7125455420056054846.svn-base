package login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login.dao.face.LoginDao;
import login.dto.Login;
import login.service.face.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired private LoginDao loginDao;
	
	@Override
	public void join(Login login) {
		loginDao.insert(login);
		
	}

	@Override
	public boolean login(Login login) {

		if( loginDao.selectCnt(login) >= 1 ) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public Login info(String id) {
		return loginDao.selectById(id);
	}

}















