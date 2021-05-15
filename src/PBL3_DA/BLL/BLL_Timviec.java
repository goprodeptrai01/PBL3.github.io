package PBL3_DA.BLL;

import java.util.*;

import PBL3_DA.DAL.TKVL_DAL;
import PBL3_DA.DTO.BANG_CAP;
import PBL3_DA.DTO.DIA_CHI;
import PBL3_DA.DTO.HO_SO;
import PBL3_DA.DTO.HO_SO_VIEW;
import PBL3_DA.DTO.KI_NANG;
import PBL3_DA.DTO.NN_TH;
import PBL3_DA.DTO.TAI_KHOAN;

public class BLL_Timviec {
	private static BLL_Timviec _instance;

	public static BLL_Timviec Instance() {
		if (_instance == null)
			_instance = new BLL_Timviec();
		return _instance;
	}

	private BLL_Timviec() {

	}
	
	public ArrayList<HO_SO_VIEW> GetAllListHStoView_BLL(){
		return TKVL_DAL.Instance().GetAllListHStoView_DAL();
	}
	
	public List<HO_SO> GetAllListHS_BLL() {
		return TKVL_DAL.Instance().GetAllListHS_DAL();
	}

	public void ExecuteDB(HO_SO hs, BANG_CAP bc, DIA_CHI dc, KI_NANG kn, NN_TH nt, TAI_KHOAN tk) {
		boolean edit = false;
		for (HO_SO i : TKVL_DAL.Instance().GetAllListHS_DAL()) {
			if (hs.getId() == i.getId())
				edit = true;
		}
		if (edit)
			TKVL_DAL.Instance().editHO_SO_DAL(hs, bc, dc, kn, nt, tk);
		else
			TKVL_DAL.Instance().addHO_SO_DAL(hs, bc, dc, kn, nt, tk);
	}

	public HO_SO GetHSbyIDHS(int iDHS) {
		// TODO Auto-generated method stub
		HO_SO data = new HO_SO();
		for (HO_SO i : TKVL_DAL.Instance().GetAllListHS_DAL()) {
			if (i.getId() == iDHS) {
				data = i;
			}
		}
		return data;
	}
	
	public BANG_CAP GetBCbyID(int iD) {
		// TODO Auto-generated method stub
		BANG_CAP data = new BANG_CAP();
		for (BANG_CAP i : TKVL_DAL.Instance().GetAllListBC_DAL()) {
			if (i.getId() == iD) {
				data = i;
			}
		}
		return data;
	}
	
	public DIA_CHI GetDCbyID(int iD) {
		// TODO Auto-generated method stub
		DIA_CHI data = new DIA_CHI();
		for (DIA_CHI i : TKVL_DAL.Instance().GetAllListDC_DAL()) {
			if (i.getId() == iD) {
				data = i;
			}
		}
		return data;
	}
	
	public KI_NANG GetKNbyID(int iD) {
		// TODO Auto-generated method stub
		KI_NANG data = new KI_NANG();
		for (KI_NANG i : TKVL_DAL.Instance().GetAllListKN_DAL()) {
			if (i.getId() == iD) {
				data = i;
			}
		}
		return data;
	}
	
	public NN_TH GetNTbyID(int iD) {
		// TODO Auto-generated method stub
		NN_TH data = new NN_TH();
		for (NN_TH i : TKVL_DAL.Instance().GetAllListNT_DAL()) {
			if (i.getId() == iD) {
				data = i;
			}
		}
		return data;
	}
	
	public TAI_KHOAN GetTKbyID(int iD) {
		// TODO Auto-generated method stub
		TAI_KHOAN data = new TAI_KHOAN();
		for (TAI_KHOAN i : TKVL_DAL.Instance().GetAllListTK_DAL()) {
			if (i.getId() == iD) {
				data = i;
			}
		}
		return data;
	}

	public ArrayList<HO_SO_VIEW> GetConditionListHStoView_BLL(String hoTen, Boolean gender, String tinhThanh, String mucLuong, String trinhDo, String ngoaiNgu, String bangCap) {
		// TODO Auto-generated method stub
		return TKVL_DAL.Instance().GetConditionListHStoView_DAL(hoTen,gender,tinhThanh,mucLuong,trinhDo,ngoaiNgu,bangCap);
	}

	public void DelbyIDHS(int iDHS) {
		TKVL_DAL.Instance().delHO_SO_DAL(iDHS);
		TKVL_DAL.Instance().delTAI_KHOAN_DAL(iDHS);
	}
	
}
