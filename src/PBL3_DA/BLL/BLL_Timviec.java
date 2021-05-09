package PBL3_DA.BLL;

import java.util.*;

import PBL3_DA.DAL.TKVL_DAL;
import PBL3_DA.DTO.HO_SO;

public class BLL_Timviec {
	private static BLL_Timviec _instance;
	public static BLL_Timviec Instance() {
		if(_instance == null) _instance = new BLL_Timviec();
		return _instance;
	}
	
	private BLL_Timviec() {
		
	}
	
	public List<HO_SO> GetAllListHS_BLL(){
		return TKVL_DAL.Instance().GetAllListHS_DAL();
	}
}
