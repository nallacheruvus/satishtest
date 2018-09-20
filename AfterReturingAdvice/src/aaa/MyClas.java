package aaa;

import org.springframework.aop.framework.ProxyFactory;

public class MyClas {
	
	public static void main(String[] args){
		ProxyFactory fact=new ProxyFactory();
		fact.addAdvice(new WeakKeyChecker());
		fact.setTarget(new KeyGenerator());
		KeyGenerator kg=(KeyGenerator)fact.getProxy();
		int u=kg.retKey(2);
		System.out.println(u);
	}

}
