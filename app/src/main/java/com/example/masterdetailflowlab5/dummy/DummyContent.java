package com.example.masterdetailflowlab5.dummy;

import com.example.masterdetailflowlab5.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {

        addItem(new DummyItem("1","Kid Cudi","Alternative/Neo Psychedelic Hiphop & Rock"));
        addItem(new DummyItem("2","Frank Ocean","Alternate/Experimental R&B"));
        addItem(new DummyItem("3","JOJI","Alternative/Lofi R&B & Pop"));
        addItem(new DummyItem("4","Mac Miller","Hiphop/Jazzhop"));
        addItem(new DummyItem("5","JPEGMAFIA","Experimental Hiphop/R&B"));

        addItem(new DummyItem("6","Lil Uzi Vert","Emo/Punk Rap"));
        addItem(new DummyItem("7","The Weeknd","Pop/R&B"));
        addItem(new DummyItem("8","Lil Yachty","Hiphop/Bubblegum Trap"));
        addItem(new DummyItem("9","Travis Scott","Psychedelic Trap"));

        }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

//    private static DummyItem createDummyItem(int position) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
//    }
//
//    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
//    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content,String details ) {
            this.id = id;
            this.content = content;
            this.details = details;


        }

        @Override
        public String toString() {
            return content;
        }
    }
}