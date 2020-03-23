package com.bh.sub.collection;

import java.util.HashSet;
import java.util.Set;

//结果没变
//总共有:3 个元素!
//总共有:3 个元素!
//Person [name=猪八戒, pwd=pwd3, age=2]
//Person [name=唐僧, pwd=pwd1, age=25]
//Person [name=孙悟空, pwd=pwd2, age=26]

public class SetNoRepeat {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		SetNoRepeat outOfMemory = new SetNoRepeat();
		Person p1 = outOfMemory.new Person("唐僧", "pwd1", 25);//new Person("唐僧", "pwd1", 25);
		Person p2 = outOfMemory.new Person("孙悟空", "pwd2", 26);
		Person p3 = outOfMemory.new Person("猪八戒", "pwd3", 27);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println("总共有:" + set.size() + " 个元素!"); // 结果：总共有:3 个元素!
		p3.setAge(2); // 修改p3的年龄,此时p3元素对应的hashcode值发生改变

		set.remove(p3); // 此时remove不掉，造成内存泄漏
		set.add(p3); // 重新添加，居然添加成功
		System.out.println("总共有:" + set.size() + " 个元素!"); // 结果：总共有:4 个元素!
		for (Person person : set) {
			System.out.println(person);
		}
	}

	private class Person {
		private String name;
		private String pwd;
		private int age;

		public Person(String name, String pwd, int age) {
			super();
			this.name = name;
			this.pwd = pwd;
			this.age = age;
		}

		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		@Override
		public String toString() {
			return "Person [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if(obj == null) {
				return false;
			}
			if(obj instanceof Person) {
				if(obj == this) {
					return true;
				}
				Person p = ((Person) obj);
				if(this.name.equals(p.getName()) && this.pwd.equals(p.getPwd()) && this.age == p.getAge()) {
					return true;
				}
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (name + pwd + age).hashCode();
//			return super.hashCode();
		}

		
	}
}
