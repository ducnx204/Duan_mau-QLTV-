package com.example.duanmau.database;

public class DbHelper1 {
    // Them du lieu nguoi dung
    public static final String INSERT_THU_THU = "Insert into ThuThu(MaTT, HoTen,MatKhau) values " +
            "('admin','Admin','123')," +
            "('quyen','Trần Mỹ Quyên','123')," +
            "('vy','Phạm Thị Tường Vy','123')," +
            "('thanh','Huỳnh Thị Thu Thanh','123')," +
            "('ly','Nguyễn Thị Lý','123')," +
            "('tram','Phan Thị Mai Trâm','123')," +
            "('uyen','Nguyễn Thị Duy Uyên','123')," +
            "('quynh','Phan Thị Xuân Quỳnh','123')," +
            "('nhi','Đỗ Thị Nhi','123')," +
            "('duc','Nguyễn Xuân Đức','123')" ;
    // them du lieu thanh vien
    public static final String INSER_THANH_VIEN = "insert into thanhvien(hoTen, namsinh) values" +
            "('Trần Mỹ Quyên','2002')," +
            "('Nguyễn Chánh Trực','2002')," +
            "('Nguyễn Quỳnh Như','2002')," +
            "('Lê Bá Tân','2002')," +
            "('Nguyễn Thị Thủy','2002')," +
            "('Phan Thị Mai Trâm','2002')," +
            "('Nguyễn Thị Lý','2002')," +
            "('Nguyễn Thị Phương Yến','2002')," +
            "('Lê Diệu Linh','2002')," +
            "('Trương Thị Tuyết Trinh','2002')," +
            "('Nguyễn Ngọc Sang','2002')," +
            "('Võ Thị Thu Hiền','2002')," +
            "('Lê Công Phúc','2002')," +
            "('Nguyễn Văn Thanh Phúc','2002')," +
            "('Nguyễn Thị Duy Uyên','2002')," +
            "('Nguyễn Thị Phương Uyên','2002')," +
            "('Phạm Thị Tường Vy','2002')," +
            "('Huỳnh Thị Thu Thanh','2002')," +
            "('Nguyễn Ngọc Phương Na','2002')," +
            "('Nguyễn Khắc Quân','2002')," +
            "('Phan Thị Xuân Quỳnh','2002')," +
            "('Võ Thị Huyền Trang','2002')," +
            "('Lê Quang Hiếu','2002')," +
            "('Trương Thế Việt Cường','2002')," +
            "('Nguyễn Ngọc Minh','2002')" ;
    // them du lieu loai sach
    public static final String INSERT_LOAI_SACH = "insert into LoaiSach(tenLoai) values" +
            "('Tiếng Anh')," +
            "('Java')," +
            "('Toán')," +
            "('Lý')," +
            "('Hóa')," +
            "('Văn')," +
            "('Sử')," +
            "('Địa')";
    // them du lieu sach
    public static final String INSERT_SACH = "insert into Sach(tensach,giaThue,maLoai) values" +
            "('Java1','2000','2')," +
            "('Java2','2000','2')," +
            "('Java3','2000','2')," +
            "('Tiếng anh 1','2000','1')," +
            "('Tiếng anh 2','2000','1')," +
            "('Tiếng anh 3','2000','1')," +
            "('Java4','2000','2')," +
            "('Toán 1','2000','3')," +
            "('Toán 2','2000','3')," +
            "('Toán 3','2000','3')," +
            "('Văn 1','2000','6')," +
            "('Văn 2','2000','6')," +
            "('Văn 3','2000','6')," +
            "('Sử 1','2000','7')," +
            "('Sử 2','2000','7')," +
            "('Sử 3','2000','7')," +
            "('Hóa 1','2000','5')," +
            "('Hóa 2','2000','5')," +
            "('Hóa 3','2000','5')," +
            "('Địa 1','2000','8')," +
            "('Địa 2','2000','8')," +
            "('Địa 3','2000','8')";

    // them du lieu phieu muon
    public static final String INSERT_PHIEU_MUON = "insert into PhieuMuon(MaTV,MaSach,TienThue,Ngay,Trasach) values" +
            "('1','1','2000','2021-10-10',1),"+
            "('1','1','2000','2021-10-10',1),"+
            "('1','1','2000','2021-10-10',1),"+
            "('1','1','2000','2021-10-10',1),"+
            "('1','1','2000','2021-10-10',1),"+
            "('2','2','2000','2021-10-10',1),"+
            "('2','2','2000','2021-10-10',1),"+
            "('2','2','2000','2021-10-10',1),"+
            "('2','2','2000','2021-10-10',1),"+
            "('2','2','2000','2021-10-10',1),"+
            "('3','3','2000','2021-10-10',1),"+
            "('3','3','2000','2021-10-10',1),"+
            "('3','3','2000','2021-10-10',1),"+
            "('3','3','2000','2021-10-10',1),"+
            "('3','3','2000','2021-10-10',1),"+
            "('4','4','2000','2021-10-10',1),"+
            "('4','4','2000','2021-10-10',1),"+
            "('4','4','2000','2021-10-10',1),"+
            "('4','4','2000','2021-10-10',1),"+
            "('4','4','2000','2021-10-10',1),"+
            "('5','5','2000','2021-10-10',1),"+
            "('5','5','2000','2021-10-10',1),"+
            "('5','5','2000','2021-10-10',1),"+
            "('5','5','2000','2021-10-10',1),"+
            "('5','5','2000','2021-10-10',1),"+
            "('6','6','2000','2021-10-10',1),"+
            "('6','6','2000','2021-10-10',1),"+
            "('6','6','2000','2021-10-10',1),"+
            "('6','6','2000','2021-10-10',1),"+
            "('6','6','2000','2021-10-10',1),"+
            "('7','7','2000','2021-10-10',1),"+
            "('7','7','2000','2021-10-10',1),"+
            "('7','7','2000','2021-10-10',1),"+
            "('7','7','2000','2021-10-10',1),"+
            "('7','7','2000','2021-10-10',1),"+
            "('8','8','2000','2021-10-10',1),"+
            "('8','8','2000','2021-10-10',1),"+
            "('8','8','2000','2021-10-10',1),"+
            "('8','8','2000','2021-10-10',1),"+
            "('8','8','2000','2021-10-10',1),"+
            "('9','9','2000','2021-10-10',1),"+
            "('9','9','2000','2021-10-10',1),"+
            "('9','9','2000','2021-10-10',1),"+
            "('9','9','2000','2021-10-10',1),"+
            "('9','9','2000','2021-10-10',1),"+
            "('10','10','2000','2021-10-10',1),"+
            "('10','10','2000','2021-10-10',1),"+
            "('10','10','2000','2021-10-10',1),"+
            "('10','10','2000','2021-10-10',1),"+
            "('10','10','2000','2021-10-10',1)";

}