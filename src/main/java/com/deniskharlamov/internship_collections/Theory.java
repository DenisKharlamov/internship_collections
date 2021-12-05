package com.deniskharlamov.internship_collections;

public class Theory {
	
	/*    Каркас коллекций Java представляет собой реализацию средствами библиотеки Java
	 * традиционных структур данных, без которых немыслимо серьёзное программирование.
	 * 
	 *    Каркас коллекций был разработан для достижения нескольких целей:
	 *     - во-первых он должен был обеспечивать высокую производительность
	 *     - во-вторых каркас обеспечивает единобразное функционирование коллекций
	 *       с высокой степенью взаимодействия
	 *     - в третьих коллекции должны допускать простое расширение и/или адаптацию
	 *       --> весь каркас коллекций построен на едином наборе стандартных интерфейсов!!!
	 *       
	 *    Алгоритмы оперируют коллекциями и определены в виде статических методов в
	 * классе Collections.
	 * 
	 * Интерфейсы
	 * ==========
	 * 
	 *                               /--> Queue --> Deque
	 * Iterable ---> Collections --> |--> Set   --> SortedSet --> NavigableSet
	 *                               \--> List
	 * 
	 * Map --> SortedMap --> NavigableMap
	 * 
	 * Iterator --> ListIterator
	 * 
	 * RandomAccess
	 * 
	 * Классы
	 * =======                                   --> Vector --> Stack
	 *                         /--> AbstractList --> AbstractSequentialList -->LinkedList
	 *                         |                 --> ArrayList
	 *                         |
	 *                         |                 /--> HashSet --> LinkedHashSet
	 * Abstract Collection --> |--> Abstract Set |--> EnumSet
	 *                         |                 \--> TreeSet
	 *                         |
	 *                         |--> AbstractQueue --> PriorityQueue
	 *                         |
	 *                         \--> ArrayQueue
	 *                      
	 *                 /--> TreeMap         
	 *                 |--> HashMap --> LinkedHashMap
	 * AbstractMap --> |--> EnumMap
	 *                 |--> WeakHashMap
	 *                 \--> IdentityHashMap
	 *             
	 *             
	 *             
	 * Интерфейс Iterator - определяет итератор который обеспечивает общий, стандартизированный
	 * способ поочередного доступа к элементам коллекций - т.е. итератор предоставляет способ
	 * перебора содержимого коллекций.
	 * 
	 * Interface SortedSet<E> - расширяет интерфейс Set для управления отсортированными множествами
	 * Interface NavigableSet<E> - расширяет интерфейс SortedSet для извлечения элементов по
	 * результатам поиска ближайшего совпадения
	 * 
	 * Если список реализует RandomAccess --> то тем самым он поддерживает эффективный
	 * произвольный доступ к своим элементам.
	 * 
	 * ArrayList - Индексированная динамически расширяющаяся и сокращающаяся последовательность.
	 * LinkedList - Упорядоченная последовательность, допускающая эффективную вставку и
	 *              удаление на любой позиции. В Java все списки являются двунаправленными.
	 * ArrayDeque - Двунаправленная очередь, реализуемая в виде циклического массива.
	 * HashSet - Неупорядоченная коллекция исключающая дубликаты.
	 * TreeSet - Отсортированное множество.
	 * EnumSet - Множество значений перечислимого типа
	 * LinkedHashSet - Множество, запоминающее порядок ввода элементов.
	 * PriorityQueue - Коллекция, позволяющая эффективно удалять наименьший элемент.
	 *                 В очереди по приоритету применяется изящная и эффективная
	 *                 структура данных - так называемая "куча" - самоорганизующееся
	 *                 двоичное дерево, в котором операции ввода и удаления вызывают
	 *                 перемещения наименьшего элемента в корень, не тратя время 
	 *                 на сортировку всех элементов в очереди.
	 * HashMap - Структура данных для хранения связанных вместе пар "ключ-значение".
	 * TreeMap - Отображение с отсортированными ключами.
	 * EnumMap - Отображение с ключами, относящимися к перечислимому типу.
	 * LinkedHashMap - Отображение с запоминанием порядка, в котором добавлялись элементы.
	 * WeakHashMap - Отображения со значениями, которые могут удаляться системой сборки
	 *               "мусора", если они нигде больше не используются.
	 * IdentityHashMap - отображение с ключами, сравниваемыми с помощью операции ==,
	 *                   а не вызова метода equals().
	 * 
	 *                     ========Exception========
	 * 
	 * ClassCastException --> при попытке ввести несовместимый по типу объект в коллекцию
	 * IllegalArgumentException --> указан неверный аргумент
	 * IllegalStateException --> попытка ввода нового элемента в заполненную коллекцию
	 *                           фиксированной длины.
	 * ConcurrentModificationException --> генерируется при вызове метода iter.next()
	 *         если итератор iter обнаруживает, что список был внешне видоизменен.
	 *         Обнаружение одновременной модификации осуществляется простым способом -
	 *         в коллекции отслеживается количество изменяющих ее операции. Каждый
	 *         итератор хранит отдельный счетчик операций модификации, вызванных
	 *         их самим. В начале каждого своего метода итератор сравнивает значение 
	 *         своего собственного счетчика модификаций со значением счетчика модификаций 
	 *         в коллекции.
	 *         
	 *                    ===========================
	 *                    
	 * 
	 * 
	 */
}






