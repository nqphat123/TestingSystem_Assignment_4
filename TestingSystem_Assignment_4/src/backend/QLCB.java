package backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entity.CanBo;
import entity.CanBo.Gender;
import entity.CongNhan;
import entity.KySu;
import entity.NhanVien;

public class QLCB {
	private ArrayList<CanBo> listCB;
	
	public QLCB(){
		listCB = new ArrayList<CanBo>();
	}
	
	//themCB
	public void themCB(CanBo canBo) {
		listCB.add(canBo);
		System.out.println("Thêm mới cán bộ thành công!");
	}
	
	
	//timkiemCB
	public void timKiemTheoTen(String fullName) {
		boolean timThay = false;
		
		for(CanBo canBo : listCB) {
			if (canBo.getFullName().equals(fullName)) {
				timThay = true;
				System.out.println(canBo);
			}
		}
		
		if(!timThay) {
			System.out.println("Không tìm thấy cán bộ: " + fullName);
		}
	}
	
	
	//hiển thị thông tin danh sách cb
	public void hienThiListCB() {
		if(listCB.isEmpty()) {
			System.out.println("Danh sách cán bộ trống!");
		}else {
			System.out.println("Danh sách cán bộ: ");
			for(CanBo canBo : listCB) {
				System.out.println(canBo);
			}
		}
	}
	
	//xóa cán bộ theo tên
	public void xoaCBTheoTen(String fullName) {
		Iterator<CanBo> iterator = listCB.iterator();
		boolean timThay = false;
		
		while(iterator.hasNext()) {
			CanBo canBo = iterator.next();
			if(canBo.getFullName().equals(fullName)) {
				iterator.remove();
				timThay = true;
				System.out.println("Xóa cán bộ thành công.");
			}
		}
		
		if(!timThay) {
			System.out.println("Không tìm thấy cán bộ: " + fullName);
		}
	}
	
	
	//thoát khỏi chương trình 
	public void thoat() {
		System.out.println("Thoát khỏi chương trình.");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("---------Chọn chức năng---------");
			System.out.println("1.Thêm cán bộ");
			System.out.println("2.Tìm kiếm cán bộ the tên.");
			System.out.println("3.Hiển thị danh sách cán bộ.");
			System.out.println("4.Xóa cán bộ theo tên.");
			System.out.println("5.Thoát chương trình.");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				//thêm cb
				System.out.println("Thêm cán bộ:");
				System.out.println("Nhập tên:");
				String fullName = sc.nextLine();
				System.out.println("Nhập tuổi:");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập giới tính: 1.Nam -- 2.Nữ -- 3.Unknown");
				int flagCB = sc.nextInt();
				Gender genderName = null;
				switch(flagCB) {
				case 1:
					genderName = Gender.Nam;
					break;
				case 2:
					genderName = Gender.Nu;
					break;
				case 3:
					genderName = Gender.Unknown;
					break;
				}
				System.out.println("Nhập địa chỉ: ");
				String address = sc.nextLine();
				sc.nextLine();
				
				//chọn loại CB
				System.out.println("Chọn loại cán bộ (1: Công nhân, 2: Kỹ sư, 3: Nhân viên)");
				int loaiCB = sc.nextInt();
				sc.nextLine();
				
				CanBo canBo;
				
				switch(loaiCB) {
				case 1:
					//Công nhân
					System.out.println("Nhập bậc công nhân: ");
					int bacCongNhan = sc.nextInt();
					sc.nextLine();
					
					canBo = new CongNhan(fullName, age, genderName, address, bacCongNhan);
					break;
					
				case 2:
					//Kỹ sư
					System.out.println("Ngành đào tạo: ");
					String nganhDT = sc.nextLine();
					
					canBo = new KySu(fullName, age, genderName, address, nganhDT);
					break;
					
				case 3:
					//nhân viên
					System.out.println("Nhập công việc: ");
					String congViec = sc.nextLine();
					
					canBo = new NhanVien(fullName, age, genderName, address, congViec);
					break;
				
				default:
					System.out.println("Lựa chọn không hợp lệ!");
					continue;
				}
				
				qlcb.themCB(canBo);
				break;
				
			case 2:
				//Tìm kiếm cán bộ theo tên
				System.out.println("----------Tìm kiếm cán bộ theo tên ----------");
				System.out.println("Nhập tên cần tìm: ");
				String tenCanTim = sc.nextLine();
				
				qlcb.timKiemTheoTen(tenCanTim);
				break;
				
			case 3:
				//hiển thị list cán bộ
				System.out.println("----------Hiển thị list cán bộ ----------");
				qlcb.hienThiListCB();
				break;
				
			case 4:
				//xóa cán bộ theo tên
				System.out.println("----------Xóa cán bộ theo tên----------");
				String hoTenCanXoa = sc.nextLine();
				qlcb.xoaCBTheoTen(hoTenCanXoa);
				break;
				
			case 5:
				//Thoát chương trình
				qlcb.thoat();
				break;
			
			default:
				System.out.println("Lựa chọn không hợp lệ.");				
			}
		} while (choice != 5);
		
		sc.close();
	}
}













