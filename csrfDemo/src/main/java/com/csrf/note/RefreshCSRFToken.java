package com.csrf.note;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**  
 * 跨站请求仿照注解 刷新CSRFToken  
 *   
 */  
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RefreshCSRFToken {
	/**  
     * 刷新token  
     *  
     * @return  
     */  
    public abstract boolean refresh() default true;  
}
