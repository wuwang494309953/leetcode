package fgo.saber.letcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TinyURL是一种URL简化服务， 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时，它将返回一个简化的URL http://tinyurl.com/4e9iAk.
 *
 * 要求：设计一个 TinyURL 的加密 encode 和解密 decode 的方法。你的加密和解密算法如何设计和运作是没有限制的，你只需要保证一个URL可以被加密成一个TinyURL，并且这个TinyURL可以用解密方法恢复成原本的URL
 */
public class Solution_535 {

    private String temp;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        temp = longUrl;
        return temp;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return temp;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String url = line;

            Solution_535 solution_535 = new Solution_535();

            String out = (solution_535.decode(solution_535.encode(url)));

            System.out.print(out);
        }
    }

}
