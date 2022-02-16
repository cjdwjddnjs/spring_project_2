// IUserService

package com.farmporter.myapp.service;

import java.util.List;
import java.util.Map;

import com.farmporter.myapp.model.AuthInfo;
import com.farmporter.myapp.model.SignUpVO;
import com.farmporter.myapp.model.UserVO;


public interface IUserService {
   
   /* ȸ�� ���� ��ȸ (���̵��) */
   UserVO getUserInfo(String userId);
   
   /* �α��� ���� ��ġ üũ */
   UserVO getUserCheck(String userid, String password);
   
   /* ȸ�� �� ��ȸ */
   int getUserCount();
   
   /* ������ ȸ�� ����Ʈ ��ȸ */
   List<UserVO> getUserList();
   
   /* ȸ������(SignUpVO) */
   void insertUser(SignUpVO signup);
   
   /* ȸ�� ���� ������Ʈ */
   void updateUser(UserVO user);

   AuthInfo authenticate(String userId, String password);

}