package ddit.chap11.sec01;

//Exception
//java.lang package
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("select cart_prod as cid, \n ");
		sb.append("  prod_name as pname, \n ");
		sb.append("  sum(prod_price * cart_qty) as amt \n ");
		sb.append("  from cart, prod \n ");
		sb.append("  where cart_prod = prod_id \n ");
		sb.append("   and cart_no like '202004%' \n ");
		sb.append("  group by cart_prod, prod_name \n ");
		sb.append("  order by 3 desc ");
		String sql=sb.toString();
		System.out.println(sql);

	}

}
