package org.food.supplier.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.food.supplier.domain.Cart;
import org.food.supplier.views.CartView;

public final class AppUtility {

	public static Object populateFieldValue(Object source, Object target) {
		Class sClazz = source.getClass();
		Class tClazz = target.getClass();
		Field[] fields = sClazz.getDeclaredFields();
		
		for (Field field : fields) {
		
			String fieldName = field.getName();
			StringBuilder setterBuilder = new StringBuilder("set");
			StringBuilder getterBuilder = new StringBuilder("get");
			String fieldStrInPascal = String.valueOf(fieldName.charAt(0)).toUpperCase()+fieldName.substring(1);
			setterBuilder.append(fieldStrInPascal);
			getterBuilder.append(fieldStrInPascal);
			try {
				Method getterMethod = sClazz.getDeclaredMethod(getterBuilder.toString(), null);
				Class returnType = getterMethod.getReturnType();
				Method setterMethod = sClazz.getDeclaredMethod(setterBuilder.toString(), returnType);
				Object val =  getterMethod.invoke(source, null);
				if(val == null)
					continue;
				setterMethod.invoke(target,val);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		return target;
	}
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		Cart cartView = new Cart();
		cart.setCartId(11);
//		cart.setProductId(44);
		cart.setStatus("Test");
		Object obj = populateFieldValue(cart, cartView);
		System.out.println(obj);
	}
	
}
