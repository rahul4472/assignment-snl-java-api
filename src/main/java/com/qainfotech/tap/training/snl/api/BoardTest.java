package com.qait.automation.Snake_n_Ladder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardTest {
	
	Board obj;
	JSONObject data;
	
	@Test(expectedExceptions={MaxPlayersReachedExeption.class})
	private void try_to_add_more_than_four_users() throws FileNotFoundException, UnsupportedEncodingException, PlayerExistsException, GameInProgressException, MaxPlayersReachedExeption, IOException
	{
		obj.registerPlayer("Player1");
		obj.registerPlayer("Player2");
		obj.registerPlayer("Player3");
		obj.registerPlayer("Player4");
		obj.registerPlayer("Player5");
	}
	
	@Test(expectedExceptions={PlayerExistsException.class})
	private void try_to_add_same_name_users() throws FileNotFoundException, UnsupportedEncodingException, PlayerExistsException, GameInProgressException, MaxPlayersReachedExeption, IOException
	{
		obj.registerPlayer("Player1");
		obj.registerPlayer("Player1");		
	}
	
	@Test(expectedExceptions={GameInProgressException.class})
	private void try_to_add_user_btw_game() throws FileNotFoundException, UnsupportedEncodingException, PlayerExistsException, GameInProgressException, MaxPlayersReachedExeption, IOException
	{
		obj.registerPlayer("Player1");
		obj.registerPlayer("Player2");
		obj.rollDice(playerUuid)
		
	}
	
	@BeforeMethod
	private void AtStartOfClass() throws FileNotFoundException, UnsupportedEncodingException, IOException
	{
		obj=new Board();
		data =new JSONObject();
	}	

}
