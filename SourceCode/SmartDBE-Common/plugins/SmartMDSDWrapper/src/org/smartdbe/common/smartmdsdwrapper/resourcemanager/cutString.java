package org.smartdbe.common.smartmdsdwrapper.resourcemanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class cutString {
	public String DefaultOut = "";

	public String cutSubString(String Text, int f, int t) {
		int l = Text.length();
		if ((f < 0) || (t < 0) || (t <= f) || (Text.equals("") || (Text == null)) || (f > l) || (t > l)) {
			return DefaultOut;
		}
		return Text.substring(f, t);
	}

	public String cutFromNextTo(String Text, String from, String to, Boolean removeft) {
		String Post = cutFrom(Text, from, removeft);
		return cutTo(Post, to, removeft);
	}

	public String cutFromTo(String Text, String from, String to, Boolean removeft) {
		if ((Text.indexOf(from) >= 0) && (Text.indexOf(to) >= 0)) {
			if (removeft) {
				return cutSubString(Text, Text.indexOf(from) + from.length(), Text.indexOf(to));
			} else {
				return cutSubString(Text, Text.indexOf(from), Text.indexOf(to) + to.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public String cutFrom(String Text, String from, Boolean removef) {
		if (Text.indexOf(from) >= 0) {
			if (removef) {
				return cutSubString(Text, Text.indexOf(from) + from.length(), Text.length());

			} else {
				return cutSubString(Text, Text.indexOf(from), Text.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public String cutTo(String Text, String to, Boolean removet) {
		if (Text.indexOf(to) >= 0) {
			if (removet) {
				return cutSubString(Text, 0, Text.indexOf(to));

			} else {
				return cutSubString(Text, 0, Text.indexOf(to) + to.length());
			}
		} else {
			return DefaultOut;
		}
	}

	public String HeaderPlusCSVDisplayTransposed(List<String> Header, List<List<String>> List2D) {
		return HeaderPlusCSVDisplayTransposed(Header, List2D, " | ", "\n");
	}

	public String HeaderPlusCSVDisplayTransposed(List<String> Header, List<List<String>> List2D, String spacerCol,
			String spacerRow) {
		String outString = DefaultOut;
		if ((Header != null) && (List2D != null)) {
			List2D.add(0, Header);
			outString = outString + List2DString(transposer(List2D), spacerCol, spacerRow) + "\n";

		} else {
			outString = outString + "NULL" + "\n";
		}
		return outString;
	}

	public String HeaderPlusCSVDisplay(List<String> Header, List<List<String>> List2D) {
		return HeaderPlusCSVDisplay(Header, List2D, " | ", "\n");
	}

	public String HeaderPlusCSVDisplay(List<String> Header, List<List<String>> List2D, String spacerCol,
			String spacerRow) {
		String outString = DefaultOut;
		if (Header != null)
			outString = outString + ListString(Header, spacerCol) + "\n";
		else
			outString = outString + "NULL" + "\n";

		if (List2D != null)
			outString = outString + List2DString(List2D, spacerCol, spacerRow) + "\n";
		else
			outString = outString + "NULL" + "\n";

		return outString;
	}

	public String List2DString(List<List<String>> List) {
		return List2DString(List, ",", "\n");
	}

	public String List2DString(List<List<String>> List, String spacerCol, String spacerRow) {
		String outString = DefaultOut;
		if (List == null)
			return outString;
		for (List<String> item : List) {
			outString = outString + ListString(item, spacerCol) + spacerRow;
		}
		return outString;
	}

	public String ListStringSW(List<String> List, int w) {
		return ListStringSW(List, w, "");
	}

	public String ListStringSW(List<String> List, int w, String Spacer) {
		String outString = "";
		if (List == null)
			return outString;
		int sz = List.size();
		for (int i = 0; i < sz; i++) {
			String entry = EDR(List.get(i));
			outString = outString + entry;
			if (i < sz - 1)
				outString = outString + SW(w, entry) + Spacer;
		}
		return outString;
	}

	public String ListString(List<String> List) {
		return ListString(List, "\n");
	}

	public String ListString(List<String> List, String spacer) {
		String outString = "";
		if (List == null)
			return outString;
		int sz = List.size();
		for (int i = 0; i < sz; i++) {
			outString = outString + EDR(List.get(i));
			if (i < sz - 1)
				outString = outString + spacer;
		}
		return outString;
	}

	public List<List<String>> CSV2V(String SV) {
		return SV2V(SV, ",", "\n");
	}

	public List<List<String>> SV2V(String SV, String SpacerCol, String SpacerRow) {
		List<List<String>> V = new ArrayList<List<String>>();
		List<String> Rows = SV2List(SV, SpacerRow);
		for (String row : Rows) {
			V.add(SV2List(row, SpacerCol));
		}
		return V;
	}

	public List<String> CSV2Rows(String CSV) {
		return SV2List(CSV, "\n");
	}

	public List<String> Row2V(String Row) {
		return SV2List(Row, ",");
	}

	public List<String> SV2List(String SV, String Spacer) {
		List<String> List = new ArrayList<String>();
		cutString cStr = new cutString();
		if (SV.isBlank() || SV.isEmpty() || (SV == null)) {
			return null;
		}
		do {
			if (SV.contains(Spacer)) {
				String part = cStr.cutTo(SV, Spacer, true);
				SV = cStr.cutFrom(SV, Spacer, true);
				if (part.equals("") || part.isBlank() || part.isEmpty() || (part == null)) {
					break;
				}
				List.add(part);
			} else {
				List.add(SV);
				break;
			}
		} while (true);
		return List;
	}

	public static final String CSV2Column_Default_EmptyIndicator = "SKIP_NO_ADD";
	public static final String CSV2Column_Default_EmptyIndicator_Display = "#";
	boolean EmptyIndicator_Display_Replacer_ON = true;

	public List<String> CSV2Column(List<List<String>> CSV, int column) {
		return CSV2Column(CSV, column, CSV2Column_Default_EmptyIndicator);
	}

	public String EDR(String in) {
		return EmptyIndicator_Display_Replacer(in);
	}

	public String EmptyIndicator_Display_Replacer(String in) {
		if (EmptyIndicator_Display_Replacer_ON) {
			if (in.equals(CSV2Column_Default_EmptyIndicator))
				return CSV2Column_Default_EmptyIndicator_Display;
		}
		return in;
	}

	public List<String> CSV2Column(List<List<String>> CSV, int column, String EmptyIndicator) {
		if (CSV == null)
			return null;
		List<String> col = new ArrayList<String>();
		int numrows = CSV.size();
		int numcolumn = 0;
		for (List<String> row : CSV) {
			if (row.size() > numcolumn)
				numcolumn = row.size();
		}
		if ((column < 0) || (numrows == 0) || (column > numcolumn))
			return null;

		for (int r = 0; r < numrows; r++) {
			String entry = EmptyIndicator;
			int len = CSV.get(r).size();
			if (column < len) {
				entry = CSV.get(r).get(column);
				if (entry != null)
					col.add(entry);
				// Note: Not ruling out empty entry here... null (non existent) is not same as
				// blank/empty.
			} else {
				col.add(entry);
			}
		}
		return col;
	}

	public <T> List<List<T>> transposer(List<List<T>> List2D) {
		// Credit: Nick Micheal [https://stackoverflow.com/users/8413007/nick-micheal]
		final int N = List2D.stream().mapToInt(l -> l.size()).max().orElse(-1);
		List<Iterator<T>> iterList = List2D.stream().map(it -> it.iterator()).collect(Collectors.toList());
		return IntStream.range(0, N).mapToObj(
				n -> iterList.stream().filter(it -> it.hasNext()).map(m -> m.next()).collect(Collectors.toList()))
				.collect(Collectors.toList());
	}

	final static public String LongSpace80 = "                                                                                ";
	final static public String LongSpace160 = LongSpace80 + LongSpace80;
	final static public String LongSpace = LongSpace160 + LongSpace80;

	public String SW(int w) {
		return SetWFiller(w);
	}

	public String SW(int w, String already) {
		return SetWFiller(w, already);
	}

	public String SetWFiller(int w) {
		return SetWFiller(w, "");
	}

	public String SetWFiller(int w, String already) {
		int l = already.length();
		if ((l > 160) || (l > w))
			return "";
		String useLongSpace = LongSpace;
		if (useLongSpace.length() < w) {
			return useLongSpace;
		} else {
			return (useLongSpace).substring(l, w);
		}
	}
}
