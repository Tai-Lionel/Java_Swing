create database University
go

use University
go

create table LopHoc (
	maLop varchar(20) primary key not null,
	tenLop nvarchar(100) not null
)

create table SinhVien (
	masv char(10) primary key not null,
	ho nvarchar(30),
	ten nvarchar(30) not null,
	phai nvarchar(10),
	email varchar(50),
	diaChi nvarchar(100),
	maLop varchar(20) references LopHoc(maLop),
)
go

insert into LopHoc values 
('DHKTPM18A', N'Đại học kĩ thuật phần mềm 18A'),
('DHKTPM18B', N'Đại học kĩ thuật phần mềm 18B')

insert into SinhVien values
('SV001', N'Nguyễn', N'Văn A', N'Nam', 'nguyenvana@example.com', N'123 Đường ABC, Quận XYZ, Thành phố HCM', 'DHKTPM18A'),
('SV002', N'Lê', N'Thị B', N'Nữ', 'lethib@example.com', N'456 Đường XYZ, Quận ABC, Thành phố HCM', 'DHKTPM18A'),
('SV003', N'Trần', N'Hồng C', N'Nữ', 'tranhongc@example.com', N'789 Đường LMN, Quận XYZ, Thành phố HCM', 'DHKTPM18B'),
('SV004', N'Phạm', N'Văn D', N'Nam', 'phamvand@example.com', N'321 Đường DEF, Quận MNO, Thành phố HCM', 'DHKTPM18B'),
('SV005', N'Hoàng', N'Thị E', N'Nữ', 'hoangthie@example.com', N'654 Đường GHI, Quận PQR, Thành phố HCM', 'DHKTPM18A'),
('SV006', N'Vũ', N'Đức F', N'Nam', 'vuducf@example.com', N'987 Đường JKL, Quận STU, Thành phố HCM', 'DHKTPM18B'),
('SV007', N'Ngô', N'Thị G', N'Nữ', 'ngothig@example.com', N'159 Đường UVW, Quận WXY, Thành phố HCM', 'DHKTPM18A'),
('SV008', N'Mai', N'Văn H', N'Nam', 'maivanh@example.com', N'753 Đường RST, Quận HIJ, Thành phố HCM', 'DHKTPM18B'),
('SV009', N'Lý', N'Thị I', N'Nữ', 'lythii@example.com', N'852 Đường OPQ, Quận CDE, Thành phố HCM', 'DHKTPM18A'),
('SV010', N'Đặng', N'Văn K', N'Nam', 'dangvank@example.com', N'357 Đường MNP, Quận BCD, Thành phố HCM', 'DHKTPM18B'),
('SV011', N'Nguyễn', N'Thành L', N'Nam', 'nguyenthanhl@example.com', N'111 Đường XYZ, Quận ABC, Thành phố HCM', 'DHKTPM18A'),
('SV012', N'Lê', N'Thị M', N'Nữ', 'lethim@example.com', N'222 Đường DEF, Quận MNO, Thành phố HCM', 'DHKTPM18A'),
('SV013', N'Trần', N'Quang N', N'Nam', 'tranquangn@example.com', N'333 Đường GHI, Quận PQR, Thành phố HCM', 'DHKTPM18B'),
('SV014', N'Phạm', N'Thị O', N'Nữ', 'phamthio@example.com', N'444 Đường JKL, Quận STU, Thành phố HCM', 'DHKTPM18B'),
('SV015', N'Hoàng', N'Văn P', N'Nam', 'hoangvanp@example.com', N'555 Đường UVW, Quận WXY, Thành phố HCM', 'DHKTPM18A'),
('SV016', N'Vũ', N'Thị Q', N'Nữ', 'vuthiq@example.com', N'666 Đường RST, Quận HIJ, Thành phố HCM', 'DHKTPM18B'),
('SV017', N'Ngô', N'Quốc R', N'Nam', 'ngoquocr@example.com', N'777 Đường OPQ, Quận CDE, Thành phố HCM', 'DHKTPM18A'),
('SV018', N'Mai', N'Thị S', N'Nữ', 'maithis@example.com', N'888 Đường MNP, Quận BCD, Thành phố HCM', 'DHKTPM18B'),
('SV019', N'Lý', N'Văn T', N'Nam', 'lyvant@example.com', N'999 Đường MNO, Quận XYZ, Thành phố HCM', 'DHKTPM18A'),
('SV020', N'Đặng', N'Thị U', N'Nữ', 'dangthiu@example.com', N'101 Đường CDE, Quận PQR, Thành phố HCM', 'DHKTPM18B')

