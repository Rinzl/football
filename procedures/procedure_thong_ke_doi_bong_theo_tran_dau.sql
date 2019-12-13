drop procedure if exists thongKeThePhatDoiBongTheoTranDau;
DELIMITER $$
CREATE procedure thongKeThePhatDoiBongTheoTranDau(
	IN id_doi_bong INT
)
begin
	SELECT
		tbl_tran_dau.id as ma_tran,
		doi_nha.id as id_doi_nha,
		doi_nha.ten_doi_bong as ten_doi_nha,
		doi_khach.id as id_doi_khach,
		doi_khach.ten_doi_bong as ten_doi_khach,
		ifnull(so_the_do, 0) as so_the_do,
		ifnull(so_the_vang, 0) as so_the_vang,		
		ifnull(so_loi, 0) as so_loi
		FROM football.tbl_tran_dau
		inner join tbl_doi_bong doi_nha
		on tbl_tran_dau.id_doi_nha = doi_nha.id and (tbl_tran_dau.id_doi_nha = id_doi_bong or tbl_tran_dau.id_doi_khach = id_doi_bong)
		inner join tbl_doi_bong doi_khach
		on tbl_tran_dau.id_doi_khach = doi_khach.id and (tbl_tran_dau.id_doi_nha = id_doi_bong or tbl_tran_dau.id_doi_khach = id_doi_bong)
		left join (
			select id_tran_dau, count(*) as so_the_do from tbl_the_do where id_doi_bong = id_doi_bong group by tbl_the_do.id_tran_dau
		) as join_the_do on tbl_tran_dau.id = join_the_do.id_tran_dau
		left join (
			select id_tran_dau, count(*) as so_the_vang from tbl_the_vang where id_doi_bong = id_doi_bong group by tbl_the_vang.id_tran_dau
		) as join_the_vang on tbl_tran_dau.id = join_the_vang.id_tran_dau
		left join (
			select id_tran_dau, count(*) as so_loi from tbl_loi where id_doi_bong = id_doi_bong group by tbl_loi.id_tran_dau
		) as join_loi on tbl_tran_dau.id = join_loi.id_tran_dau;
END $$
DELIMITER ;
