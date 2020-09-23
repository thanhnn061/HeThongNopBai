-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th9 23, 2020 lúc 01:21 PM
-- Phiên bản máy phục vụ: 5.7.26
-- Phiên bản PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlsv_db`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `baithi`
--

DROP TABLE IF EXISTS `baithi`;
CREATE TABLE IF NOT EXISTS `baithi` (
  `MaSV` int(11) NOT NULL,
  `MaLopHP` int(11) NOT NULL,
  `MaBN` text COLLATE utf8_vietnamese_ci NOT NULL,
  `ThoiGianNop` date NOT NULL,
  KEY `MaLop` (`MaLopHP`),
  KEY `MaSV` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `baithi`
--

INSERT INTO `baithi` (`MaSV`, `MaLopHP`, `MaBN`, `ThoiGianNop`) VALUES
(1050005, 123, '5', '2020-09-08'),
(1050013, 147, 'bnth01', '2020-09-10'),
(1050005, 147, 'bnth01', '2020-09-01'),
(1050025, 147, 'bnth01', '2020-09-04');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giangvien`
--

DROP TABLE IF EXISTS `giangvien`;
CREATE TABLE IF NOT EXISTS `giangvien` (
  `MaGV` int(11) NOT NULL,
  `TenGV` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  PRIMARY KEY (`MaGV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `giangvien`
--

INSERT INTO `giangvien` (`MaGV`, `TenGV`) VALUES
(782115, 'dinh thi hong huyen'),
(789912, 'nguyen thi loan'),
(1010001, 'Nguyễn Thanh Bình'),
(1010002, 'Hồ Văn Lâm'),
(1010003, 'Vũ Sơn Lâm'),
(1010004, 'Phan Đình Sinh'),
(1010011, 'Trần Thiên Thành'),
(1010012, 'Trần Thị Liên'),
(1010013, 'Lê Quang Hùng'),
(1010742, 'pham van viet');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lophocphan`
--

DROP TABLE IF EXISTS `lophocphan`;
CREATE TABLE IF NOT EXISTS `lophocphan` (
  `MaLopHP` int(11) NOT NULL,
  `MaGV` int(11) NOT NULL,
  `MaSV` int(11) NOT NULL,
  `MaMH` int(11) NOT NULL,
  `NamHoc` text COLLATE utf8_vietnamese_ci NOT NULL,
  `HocKy` text COLLATE utf8_vietnamese_ci NOT NULL,
  `SoBN` int(11) NOT NULL,
  `TenLopHP` text COLLATE utf8_vietnamese_ci NOT NULL,
  `LinkNopBai` text COLLATE utf8_vietnamese_ci NOT NULL,
  PRIMARY KEY (`MaLopHP`),
  KEY `MaGV` (`MaGV`),
  KEY `ID_MH` (`MaMH`),
  KEY `MaSV` (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `lophocphan`
--

INSERT INTO `lophocphan` (`MaLopHP`, `MaGV`, `MaSV`, `MaMH`, `NamHoc`, `HocKy`, `SoBN`, `TenLopHP`, `LinkNopBai`) VALUES
(112, 1010001, 1050013, 9010006, '2019-2020', 'HK2', 7, 'kien truc huong dich vu k39 a', 'D:\\\\KiemTra\\kien truc huong dich vu k39 a'),
(123, 1010002, 1050005, 9010003, '2018-2019', 'HK1', 5, 'Xml va ung dung', ''),
(147, 1010003, 1050025, 9010004, '2019-2020', 'HK1', 4, 'quan ly du an', ''),
(1121, 1010001, 1050013, 9010007, '2019-2020', 'HK2', 5, 'lap trinh tren window', 'D:\\\\KiemTra\\lap trinh tren window'),
(12312, 1010003, 1050013, 9010005, '2018-2019', 'HK2', 5, 'lap trinh thiet bi di dong k39a', ''),
(14717, 1010002, 1050010, 147850, '2018-2019', 'HK1', 5, 'tuong tac nguoi may 1', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monhoc`
--

DROP TABLE IF EXISTS `monhoc`;
CREATE TABLE IF NOT EXISTS `monhoc` (
  `MaMH` int(11) NOT NULL,
  `TenMH` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  PRIMARY KEY (`MaMH`),
  KEY `ID_MH` (`MaMH`),
  KEY `MaMH` (`MaMH`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `monhoc`
--

INSERT INTO `monhoc` (`MaMH`, `TenMH`) VALUES
(147850, 'Tuong tac nguoi may'),
(147851, 'kiem thu phan mem'),
(147852, 'Thuc hanh lap trinh'),
(147854, 'ngon ngu mo hinh hoa'),
(147855, 'quan tri mang'),
(9010001, 'cong nghe java'),
(9010002, 'lap trinh ung dung web'),
(9010003, 'XML va ung dung'),
(9010004, 'quan ly du an'),
(9010005, 'lap trinh thiet bi di dong'),
(9010006, 'kien truc huong dich vu'),
(9010007, 'lap trinh tren window'),
(9010008, 'phan tich thiet ke he thong thong tin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
CREATE TABLE IF NOT EXISTS `sinhvien` (
  `MaSV` int(11) NOT NULL,
  `TenSV` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  PRIMARY KEY (`MaSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `TenSV`) VALUES
(123, 'huy'),
(1050005, 'Lê Thanh Hoài'),
(1050010, 'Đỗ Trọng Thi'),
(1050011, 'Võ Văn Phương'),
(1050012, 'Lê Quang Huy'),
(1050013, 'Nguyễn Ngọc Thạnh'),
(1050025, 'Phạm Chí Thanh'),
(1050030, 'Nguyễn Thái Dương'),
(1050031, 'Trương Minh Sơn'),
(1050032, 'Trương Minh Long'),
(1050033, 'Nguyễn Quốc Đạt'),
(1050035, 'Đặng Thị Mai Phượng'),
(1050036, 'Bùi Trọng Dũng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `ID` int(11) NOT NULL,
  `user` varchar(200) COLLATE utf8_vietnamese_ci NOT NULL,
  `MatKhau` text COLLATE utf8_vietnamese_ci NOT NULL,
  `PhanQuyen` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`ID`, `user`, `MatKhau`, `PhanQuyen`) VALUES
(1010001, 'binh', '123456', 0),
(1050010, 'thi', '123456', 1),
(1050013, 'thanh', '123456', 1),
(1050025, 'thanh1', '123456', 1);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `baithi`
--
ALTER TABLE `baithi`
  ADD CONSTRAINT `baithi_ibfk_1` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`),
  ADD CONSTRAINT `baithi_ibfk_2` FOREIGN KEY (`MaLopHP`) REFERENCES `lophocphan` (`MaLopHP`);

--
-- Các ràng buộc cho bảng `lophocphan`
--
ALTER TABLE `lophocphan`
  ADD CONSTRAINT `lophocphan_ibfk_1` FOREIGN KEY (`MaGV`) REFERENCES `giangvien` (`MaGV`),
  ADD CONSTRAINT `lophocphan_ibfk_2` FOREIGN KEY (`MaMH`) REFERENCES `monhoc` (`MaMH`),
  ADD CONSTRAINT `lophocphan_ibfk_3` FOREIGN KEY (`MaSV`) REFERENCES `sinhvien` (`MaSV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
