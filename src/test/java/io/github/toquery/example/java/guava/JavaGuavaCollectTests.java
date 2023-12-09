package io.github.toquery.example.java.guava;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.*;
import io.github.toquery.example.java.BaseTest;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.*;

public class JavaGuavaCollectTests extends BaseTest {

    @Test
    public void collectCreateTests() {
        // 普通Collection的创建
        List<String> list = Lists.newArrayList("a", "b", "c");
        Set<String> set = Sets.newHashSet("a", "b", "c");
        Map<String, String> map = Maps.newHashMap();

        // ImmutableList 不变Collection的创建
        ImmutableList<String> immutableList1 = ImmutableList.of("a", "b", "c");
        ImmutableSet<String> immutableSet1 = ImmutableSet.of("e1", "e2");
        ImmutableMap<String, String> immutableMap1 = ImmutableMap.of("k1", "v1", "k2", "v2");

        ImmutableList<String> immutableList2 = ImmutableList.copyOf(immutableList1);
        ImmutableSet<String> immutableSet2 = ImmutableSet.copyOf(immutableSet1);
        ImmutableMap<String, String> immutableMap2 = ImmutableMap.copyOf(immutableMap1);


        Iterable<String> iterable = Iterables.unmodifiableIterable(list);

    }

    @Test
    public void iterablesTests() {

        Iterable<String> iterable1 = Lists.newArrayList("a", "b", "c");
        Iterable<Integer> iterable2 = Lists.newArrayList(1, 2, 3);
        Iterable<Serializable> concatIterable1 = Iterables.concat(iterable1, iterable2);
        LOG.info("Iterables.concat = {}", concatIterable1);
        Iterables.removeAll(concatIterable1, Lists.newArrayList("a", 1));
        Iterables.removeAll(iterable1, Lists.newArrayList("b"));
        Iterables.removeAll(iterable2, Lists.newArrayList(2));
        LOG.info("Iterables.concat = {}", concatIterable1);

        LOG_SPLIT();

        Iterable<Serializable> iterable3 = Lists.newArrayList("a", "b", "c", 1, 2, 3);

        Iterable<Serializable> cycleIterable = Iterables.cycle(iterable3);
        LOG.info("Iterables.cycle = {}", cycleIterable);

        int size = Iterables.size(iterable3);
        LOG.info("Iterables.size = {}", size);

        int frequency = Iterables.frequency(iterable3, "a");
        LOG.info("Iterables.frequency = {}", frequency);


        // 将iterable划分为给定大小的不可修改的子列表, 不足时填充 null
        Iterable<List<Serializable>> paddedPartitionIterable = Iterables.paddedPartition(iterable3, 5);
        LOG.info("Iterables.paddedPartition = {}", paddedPartitionIterable);

        Iterable<List<Serializable>> partitionIterable = Iterables.partition(iterable3, 2);
        LOG.info("Iterables.partition = {}", partitionIterable);

        Iterable<Serializable> limitIterable = Iterables.limit(iterable3, 2);
        LOG.info("Iterables.limit = {}", limitIterable);

        Iterable<Serializable> skipIterable = Iterables.skip(iterable3, 2);
        LOG.info("Iterables.skip = {}", skipIterable);

        LOG_SPLIT();

        Iterable<Serializable> iterable4 = Lists.newArrayList("a", "b", "c", 1, 2, 3);
        boolean removeAll1 = Iterables.removeAll(iterable4, Lists.newArrayList("a", 1));
        LOG.info("Iterables.removeAll = {} , {}", removeAll1, iterable4);
        boolean removeAll2 = Iterables.removeAll(iterable4, Lists.newArrayList("d", 4));
        LOG.info("Iterables.removeAll = {} , {}", removeAll2, iterable4);

        LOG_SPLIT();

        Iterable<Serializable> iterable5 = Lists.newArrayList("a", "b", "c", 1, 2, 3);
        boolean retainAll1 = Iterables.retainAll(iterable5, Lists.newArrayList("b", 2));
        LOG.info("Iterables.retainAll = {} , {}", retainAll1, iterable5);
        boolean retainAll2 = Iterables.retainAll(iterable5, Lists.newArrayList("d", 4));
        LOG.info("Iterables.retainAll = {} , {}", retainAll2, iterable5);

        LOG_SPLIT();

        Iterable<Serializable> iterable6 = Lists.newArrayList("a", "b", "c", 1, 2, 3);
        boolean removeIf = Iterables.removeIf(iterable6, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                return input.equals("b") || input.equals("2");
            }
        });
        LOG.info("Iterables.removeIf = {} , {}", removeIf, iterable6);


        // 确定两个可迭代对象是否包含相同顺序的相等元素。更具体地说，如果 iterable1 和 iterable2 包含相同数量的元素，并且 iterable1 的每个元素都等于 iterable2 的相应元素，则此方法返回 true。
        Iterable<String> iterable7 = Lists.newArrayList("a", "b", "c");
        Iterable<Integer> iterable8 = Lists.newArrayList(1, 2, 3);
        boolean elementsEqual = Iterables.elementsEqual(iterable7, iterable8);
        LOG.info("Iterables.elementsEqual = {} , {} elementsEqual {} ", elementsEqual, iterable7, iterable8);

        // 判断集合是否为空
        boolean isEmpty = Iterables.isEmpty(iterable3);
        LOG.info("Iterables.isEmpty = {}", isEmpty);

        // 获取第一个元素，如果集合为空返回null
        Serializable first = Iterables.getFirst(iterable3, null);
        LOG.info("Iterables.getFirst = {}", first);

        // 获取最后一个元素，如果集合为空返回null
        Serializable last = Iterables.getLast(iterable3, null);
        LOG.info("Iterables.getLast = {}", last);

        // 获取所有符合条件的元素
        Iterable<Serializable> filterIterable = Iterables.filter(iterable3, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                return input.toString().startsWith("a");
            }
        });
        LOG.info("Iterables.filter = {}", filterIterable);

        boolean anyIterable = Iterables.any(iterable3, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                return input.toString().startsWith("a");
            }
        });
        LOG.info("Iterables.any = {}", anyIterable);

        boolean allIterable = Iterables.all(iterable3, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                return input.toString().startsWith("a");
            }
        });
        LOG.info("Iterables.all = {}", allIterable);


        Serializable findIterable = Iterables.find(iterable3, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                // 返回第一个符合条件的元素, 否则抛出NoSuchElementException
                return input.equals("a");
            }
        });
        LOG.info("Iterables.find = {}", findIterable);


        Optional<Serializable> tryFindIterable = Iterables.tryFind(iterable3, new Predicate<Serializable>() {
            @Override
            public boolean apply(Serializable input) {
                return input.equals("aa");
            }
        });
        LOG.info("Iterables.tryFind = {}", tryFindIterable.isPresent());

        // 转换集合类型
        Iterable<Serializable> transformIterable = Iterables.transform(iterable3, new Function<Serializable, Serializable>() {
            @Override
            public Serializable apply(Serializable input) {
                return input.toString() + input.toString();
            }
        });
        LOG.info("Iterables.transform = {}", transformIterable);


        Iterable<Serializable> consumingIterable = Iterables.consumingIterable(iterable3);
        LOG.info("Iterables.consumingIterable = {}", consumingIterable);


        // 合并并排序
        Iterable<Serializable> mergeSortedIterable = Iterables.mergeSorted(Arrays.asList(Lists.newArrayList("a", "b"), Lists.newArrayList(1, 2)), new Comparator<Serializable>() {
            @Override
            public int compare(Serializable o1, Serializable o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        LOG.info("Iterables.mergeSorted = {}", mergeSortedIterable);

    }

    @Test
    public void fluentIterableTests() {
        Iterable<String> iterable1 = Lists.newArrayList("a", "b", "c");
        Iterable<Integer> iterable2 = Lists.newArrayList(1, 2, 3);

        FluentIterable<Serializable> concatFluentIterable = FluentIterable.concat(iterable1, iterable2);
    }


    @Test
    public void setTests() {

    }

    @Test
    public void mapTests() {
        // Multimaps
        ListMultimap<Integer, String> listMultimap = ArrayListMultimap.create();
        listMultimap.put(1, "a");
        listMultimap.put(1, "b");
        listMultimap.put(2, "c");
        List<String> listMultimapValues = listMultimap.get(1); // 返回[a, b]
        LOG.info("listMultimap = {}", listMultimapValues);

        // Maps
        Map<Integer, String> immutableMap = ImmutableMap.of(1, "a", 2, "b", 3, "c");
        LOG.info("immutableMap = {}", immutableMap);

        LOG_SPLIT();

        Table<String, String, Integer> hashBasedTable1 = HashBasedTable.create();
        //存放元素
        hashBasedTable1.put("Hydra", "Jan", 20);
        hashBasedTable1.put("Hydra", "Feb", 28);

        hashBasedTable1.put("Trunks", "Jan", 28);
        hashBasedTable1.put("Trunks", "Feb", 16);

        //取出元素
        Integer dayCount = hashBasedTable1.get("Hydra", "Feb");
        LOG.info("hashBasedTable.value = {}", dayCount);

        //rowKey或columnKey的集合
        Set<String> rowKeys = hashBasedTable1.rowKeySet();
        Set<String> columnKeys = hashBasedTable1.columnKeySet();
        LOG.info("hashBasedTable.rowKeys = {}", rowKeys);
        LOG.info("hashBasedTable.columnKeys = {}", columnKeys);

        //value集合
        Collection<Integer> values = hashBasedTable1.values();
        LOG.info("hashBasedTable.values = {}", values);

        // 转为嵌套的Map
        Map<String, Map<String, Integer>> rowMap = hashBasedTable1.rowMap();
        LOG.info("hashBasedTable.rowMap = {}", rowMap);

        Map<String, Map<String, Integer>> columnMap = hashBasedTable1.columnMap();
        LOG.info("hashBasedTable.columnMap = {}", columnMap);


        // 转换rowKey和columnKey
        Table<String, String, Integer> hashBasedTable2 = Tables.transpose(hashBasedTable1);
        Set<Table.Cell<String, String, Integer>> cellSet = hashBasedTable2.cellSet();
        cellSet.forEach(cell ->
                LOG.info("转换rowKey和columnKey的数据 = 行 {} , 列 {} , 值 {} ", cell.getRowKey(), cell.getColumnKey(), cell.getValue())
        );

        // 改变了原始或转置表中的值，他们会相互同步值
        hashBasedTable1.put("Trunks", "Jan", 25);
        hashBasedTable2.put("Feb", "Trunks", 22);
        LOG.info("hashBasedTable.values = {}", hashBasedTable1.values());


        LOG_SPLIT();

        // 双向Map
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("Hydra", "Programmer");
        biMap.put("Tony", "IronMan");
        biMap.put("Thanos", "Titan");
        // 使用key获取value
        LOG.info("biMap.get = {}", biMap.get("Tony"));

        BiMap<String, String> inverseBiMap = biMap.inverse();
        //使用value获取key
        LOG.info("biMap.inverse.get = ", inverseBiMap.get("Titan"));

        // 反转后的BiMap并不是一个新的对象，它实现了一种视图的关联，所以对反转后的BiMap执行的所有操作会作用于原先的BiMap上
        // 因此修改后的值也能同步回原数据
        inverseBiMap.put("IronMan", "Stark");
//        LOG.info(biMap);

        // 注意value不可重复
        try {
            biMap.put("Tony", "IronMan");
        } catch (IllegalArgumentException exception) {
            LOG.error("BiMap的value不可重复");
        }
        biMap.put("Stark", "IronMan");





    }

}
