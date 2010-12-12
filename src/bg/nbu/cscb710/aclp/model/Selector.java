package bg.nbu.cscb710.aclp.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import bg.nbu.cscb710.aclp.view.UserRequest;

/**
 * Интерфейс, предоставящ методи за филтриране на заявки според желаните от
 * потребителя условия.
 * 
 * @author Георги Николов
 */
public interface Selector {

	/**
	 * Метод, който избира групира данните по промоции.
	 * 
	 * @param requests
	 *            всички направени заявки.
	 * @return {@link Map} с ключ името на промоцията и стойностите на всяка
	 *         заявка асоциирана с тази промоция.
	 */
	public Map < String, UserRequest > getTopCampaigns (
			Collection < UserRequest > requests );

	/**
	 * Метод, който филтрира десетте най-често показвани изображения на
	 * продукти.
	 * 
	 * @param requests
	 *            всички направени заявки.
	 * @return {@link Map} с ключ име на изображение и стойностите на всяка
	 *         заявка асоциирана с това изображение.
	 */
	public Map < String, UserRequest > getTopProducts (
			Collection < UserRequest > requests );

	/**
	 * Метод, който филтрира заявките по категории и избира петте най-търсени
	 * продукта от всяка категория.
	 * 
	 * @param requests
	 *            всички направени заявки.
	 * @return {@link Map} с ключ името на категорията и стойност от списък с
	 *         петте най-търсени продукта от тази категория.
	 */
	public Map < String, List < UserRequest > > getTopCategories (
			Collection < UserRequest > requests );
}
