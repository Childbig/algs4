import java.io.*;
import java.text.Collator;
import java.util.*;

import static java.util.Comparator.*;

public class Main {
    private final static Comparator CHINA_COMPARE = Collator.getInstance(java.util.Locale.CHINA);

    public static void main(String[] args) {
        Set<Category> categorySet= new HashSet<>();
        List<Category> categoryList = new ArrayList<>();

        try (FileReader reader = new FileReader("/Users/sai/Desktop/item_category_ng.txt");
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
                String[] arrayList = line.split("\\t");
                if (arrayList.length < 2) {
                    continue;
                }
                String category_id = "";
                if (arrayList[4].contains("-")) {
                    category_id = arrayList[4].split("-")[0];
                } else {
                    category_id = arrayList[4];
                }
                String catagory_names = arrayList[3];

                if (catagory_names.contains("/")) {
                    String[] listCate = catagory_names.split("/");
                    for (String name : listCate) {
                        Category category = new Category(category_id,name);
                        categoryList.add(category);
                    }
                } else {
                    Category category = new Category(category_id, catagory_names);
                    categoryList.add(category);
                }
            }
            Collections.sort(categoryList , CHINA_COMPARE);
            Set<Category> finalCategorySet = categorySet;
            categoryList.stream().forEach(k -> finalCategorySet.add(k));

            finalCategorySet.stream().forEach(k -> System.out.println(k.toString()) );
            try {
                File writeName = new File("/Users/sai/Desktop/catagory.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
                writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
                try (FileWriter writer = new FileWriter(writeName);
                     BufferedWriter out = new BufferedWriter(writer)
                ) {
                    for (Category category : categoryList) {
                        out.write(category.toString()); //
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    static class Category {
        public Category(String id, String name) {
            this.id = id;
            this.name = name;
        }

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  id + "\t" + name + "\r\n";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Category)) return false;
            Category category = (Category) o;
            return Objects.equals(getId(), category.getId()) &&
                    Objects.equals(getName(), category.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getName());
        }
    }
}
