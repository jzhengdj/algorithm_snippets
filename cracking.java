//
Arraylist<String> merge(String[] words, String[] more) {
  Arraylist<String> sentence= new Arraylist<String>();
  for (String w : words) sentence.add(w);
  for (String w: more) sentence.add(w);
  return sentence;
}

String joinWords(String[] words) {
  StringBuilder sentence new StringBuilder();
  for (String w : words) {
  sentence.append(w);
}
  return sentence.toString();
}

// determine if a string has all unique characters
// time O(n), space O(1)
boolean isUniqueChars(String str){
  if (str.length() > 128) return false;
  
  boolean[] char_set = new boolean[128];
  for (int i = 0; i < str.length(); i++){
    int val = str.charAt(i);
    if (char_set[val]) return false;
    char_set[val] = true;
  }
  return true;
}

boolean isUniqueChars2(String str){
  int checker = 0;
  for (int i = 0; i < str.length(); i++){
    int val = str.charAt(i) - 'a';
    if (checker & (1 << val)) return false;
    else checker |= (1<<val);
  }
  return true;
}
