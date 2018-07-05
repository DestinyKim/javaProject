package test.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection...");

		// (매개변수들), {객체}, [배열]
		// 1,2,3,4,5
		// [1,2,3,4,5]
		// {a1:1,a2:2,a3:3,a4:4,a5:5}
		// {arr1:[1,2,3,4,5],arr2:[10,20,30,40,50]}
		// [[1,2,3,4,5],[1,2,3,4,5]]
		// [{a1:1,a2:2,a3:3,a4:4,a5:5},{a1:1,a2:2,a3:3,a4:4,a5:5}]
		TestVO[] vos = new TestVO[2];// 방개수 2개

		List<TestVO> list = new ArrayList<TestVO>(); // 방개수 3개
		TestVO vo = new TestVO();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		System.out.println("list.size():" + list.size());

		Set<TestVO> set = new HashSet();
		set.add(vo);
		set.add(vo);
		set.add(vo);
		System.out.println("set.size():" + set.size());
		
		
		//[{"vo1":{num:0, name:null},"vo2":{num:0, name:null},"vo3":{num:0, name:null}}} 오브젝트에 속성은 키
		Map<String, TestVO> map = new HashMap<String, TestVO>();
		map.put("vo1", vo);
		map.put("vo2", vo);
		map.put("vo3", vo);
		System.out.println("map.size():" + map.size());
		
		//[3],list, set //key value에 대한 가변적인 동적 할당
		List<Map<String, TestVO>> maps = new ArrayList<Map<String, TestVO>>();
		maps.add(map);
		maps.add(map);
		maps.add(map);
		
		//{key1:[{},{}], key2:[{}], key3:[{},{},{}]}
		Map<String, List<TestVO>> mm = new Hashtable<String, List<TestVO>>();
		mm.put("key1", new ArrayList<TestVO>());
		mm.put("key2", new ArrayList<TestVO>());
		mm.put("key3", new ArrayList<TestVO>());
		
	}

}
