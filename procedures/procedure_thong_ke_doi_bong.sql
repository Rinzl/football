DELIMITER $$
drop procedure if exists thongKeThePhatDoiBong;
CREATE procedure thongKeThePhatDoiBong()
begin
	SELECT 
		tbl_doi_bong.id,
		tbl_doi_bong.ten_doi_bong,
		tbl_doi_bong.dia_chi,
		tbl_doi_bong.tptt,
		tbl_doi_bong.id_san,
		tbl_san.ten_san,
		tbl_san.dia_chi,
		tbl_san.suc_chua,
		ifnull(so_the_do, 0) as so_the_do,
		ifnull(so_the_vang, 0) as so_the_vang,
		ifnull(so_loi, 0) as so_loi
		FROM tbl_doi_bong
		inner join tbl_san
		on tbl_doi_bong.id_san = tbl_san.id
		left join (
			select id_doi_bong, count(*) as so_the_do from tbl_the_do group by tbl_the_do.id_doi_bong
		) as join_the_do on tbl_doi_bong.id = join_the_do.id_doi_bong
		left join (
			select id_doi_bong, count(*) as so_the_vang from tbl_the_vang group by tbl_the_vang.id_doi_bong
		) as join_the_vang on tbl_doi_bong.id = join_the_vang.id_doi_bong
		left join (
			select id_doi_bong, count(*) as so_loi from tbl_loi group by tbl_loi.id_doi_bong
		) as join_loi on tbl_doi_bong.id = join_loi.id_doi_bong
		order by so_the_do desc, so_the_vang desc, so_loi desc, ten_doi_bong asc;
END $$
DELIMITER ;
