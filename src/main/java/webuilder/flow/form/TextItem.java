package webuilder.flow.form;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import webuilder.flow.FormItem;

/**
 * 文本框
 * 
 * @author lijian
 *
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TextItem extends AbstractItem implements FormItem {

	private String placeholder;

	private int maxLength;

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return FormItemType.TEXT;
	}

	public TextItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextItem(String name, String text) {
		super(name, text);
		// TODO Auto-generated constructor stub
	}

}
