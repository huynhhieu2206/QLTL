package advance.dev.dao;

import advance.dev.model.TaiLieu;
import advance.dev.model.Imanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements Imanager {
	private List<TaiLieu> TaiLieuList = new ArrayList<TaiLieu>();

	@Override
	public void add(TaiLieu tl) {
		TaiLieuList.add(tl);
	}

	@Override
	public void print() {
		for (TaiLieu tl : TaiLieuList) {
			System.out.println(tl.getmaTaiLieu() + " - " + tl.gettenNhaXuatBan() + " - " + tl.getsoLuongPhatHanh());
		}
	}

	@Override
	public void sortByName(int order) {
		
		Collections.sort(TaiLieuList, new Comparator<TaiLieu>() {
			@Override
			public int compare(TaiLieu tl1, TaiLieu tl2) {
				return order * tl1.getmaTaiLieu().compareTo(tl2.getmaTaiLieu());
			}
		});
	}
}
