package passoffTests.serverTests;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

//package passoffTests.obfuscatedTestClasses;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import passoffTests.testClasses.TestModels;

public class TestServerFacade2 {
    //private String _157ea3b5e2134e129d3e8247875ae918;
    private String _7a2c0ed700794f9a95fea387d1d303c0;
    private String _157ea3b5e2134e129d3e8247875ae918; //sorry

    public TestServerFacade2(String var1, String var2) {
        System.out.println(var1);
        System.out.println(var2);
        this._157ea3b5e2134e129d3e8247875ae918 = var1 ;
        this._7a2c0ed700794f9a95fea387d1d303c0 = var2 ;
    }

    public int getStatusCode() {
        return Integer.parseInt(this._157ea3b5e2134e129d3e8247875ae918);
    }

    public TestModels.TestLoginRegisterResult register(TestModels.TestRegisterRequest var1) {
        try {
            HttpURLConnection var2;
            System.out.println("url:");
            System.out.println("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/user");

            (var2 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/user")).openConnection()).setRequestMethod("POST");
            var2.setDoOutput(true);
            var2.addRequestProperty("Accept", "application/json");
            String var5 = _157ea3b5e2134e129d3e8247875ae918((Object)var1);
            OutputStream var3 = var2.getOutputStream();
            _157ea3b5e2134e129d3e8247875ae918(var5, var3);
            var3.close();
            var2.connect();
            int var8 = var2.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var8 + "";
            InputStream var6;
            TestModels.TestLoginRegisterResult var7;
            if (var2.getResponseCode() == 200) {
                (var7 = (TestModels.TestLoginRegisterResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var2.getInputStream()), TestModels.TestLoginRegisterResult.class)).success = Boolean.TRUE;
                var6.close();
                return var7;
            } else {
                (var7 = (TestModels.TestLoginRegisterResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var2.getErrorStream()), TestModels.TestLoginRegisterResult.class)).success = Boolean.FALSE;
                var6.close();
                return var7;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestLoginRegisterResult login(TestModels.TestLoginRequest var1) {
        try {
            HttpURLConnection var2;
            (var2 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/session")).openConnection()).setRequestMethod("POST");
            var2.setDoOutput(true);
            var2.addRequestProperty("Accept", "application/json");
            String var5 = _157ea3b5e2134e129d3e8247875ae918((Object)var1);
            OutputStream var3 = var2.getOutputStream();
            _157ea3b5e2134e129d3e8247875ae918(var5, var3);
            var3.close();
            var2.connect();
            int var8 = var2.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var8+"";
            InputStream var6;
            TestModels.TestLoginRegisterResult var7;
            if (var2.getResponseCode() == 200) {
                (var7 = (TestModels.TestLoginRegisterResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var2.getInputStream()), TestModels.TestLoginRegisterResult.class)).success = Boolean.TRUE;
                var6.close();
                return var7;
            } else {
                (var7 = (TestModels.TestLoginRegisterResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var2.getErrorStream()), TestModels.TestLoginRegisterResult.class)).success = Boolean.FALSE;
                var6.close();
                return var7;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestResult logout(String var1) {
        try {
            HttpURLConnection var2;
            (var2 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/session")).openConnection()).setRequestMethod("DELETE");
            var2.setDoOutput(false);
            var2.addRequestProperty("Accept", "application/json");
            var2.addRequestProperty("Authorization", var1);
            var2.connect();
            int var3 = var2.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var3 + "";
            InputStream var5;
            TestModels.TestResult var6;
            if (var2.getResponseCode() == 200) {
                (var6 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var2.getInputStream()), TestModels.TestResult.class)).success = Boolean.TRUE;
                var5.close();
                return var6;
            } else {
                (var6 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var2.getErrorStream()), TestModels.TestResult.class)).success = Boolean.FALSE;
                var5.close();
                return var6;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestListResult listGames(String var1) {
        try {
            HttpURLConnection var2;
            (var2 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/game")).openConnection()).setRequestMethod("GET");
            var2.setDoOutput(false);
            var2.addRequestProperty("Authorization", var1);
            var2.addRequestProperty("Accept", "application/json");
            var2.connect();
            int var3 = var2.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var3 + "";
            InputStream var5;
            TestModels.TestListResult var6;
            if (var2.getResponseCode() == 200) {
                (var6 = (TestModels.TestListResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var2.getInputStream()), TestModels.TestListResult.class)).success = Boolean.TRUE;
                var5.close();
                return var6;
            } else {
                (var6 = (TestModels.TestListResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var2.getErrorStream()), TestModels.TestListResult.class)).success = Boolean.FALSE;
                var5.close();
                return var6;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestCreateResult createGame(TestModels.TestCreateRequest var1, String var2) {
        try {
            HttpURLConnection var3;
            (var3 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/game")).openConnection()).setRequestMethod("POST");
            var3.setDoOutput(true);
            var3.addRequestProperty("Authorization", var2);
            var3.addRequestProperty("Accept", "application/json");
            String var5 = _157ea3b5e2134e129d3e8247875ae918((Object)var1);
            OutputStream var7 = var3.getOutputStream();
            _157ea3b5e2134e129d3e8247875ae918(var5, var7);
            var7.close();
            var3.connect();
            int var8 = var3.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var8+"";
            InputStream var6;
            TestModels.TestCreateResult var9;
            if (var3.getResponseCode() == 200) {
                (var9 = (TestModels.TestCreateResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getInputStream()), TestModels.TestCreateResult.class)).success = Boolean.TRUE;
                var6.close();
                return var9;
            } else {
                (var9 = (TestModels.TestCreateResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getErrorStream()), TestModels.TestCreateResult.class)).success = Boolean.FALSE;
                var6.close();
                return var9;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestResult verifyJoinPlayer(TestModels.TestJoinRequest var1, String var2) {
        try {
            HttpURLConnection var3;
            (var3 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/game")).openConnection()).setRequestMethod("PUT");
            var3.setDoOutput(true);
            var3.addRequestProperty("Authorization", var2);
            var3.addRequestProperty("Accept", "application/json");
            String var5 = _157ea3b5e2134e129d3e8247875ae918((Object)var1);
            OutputStream var7 = var3.getOutputStream();
            _157ea3b5e2134e129d3e8247875ae918(var5, var7);
            var7.close();
            var3.connect();
            int var8 = var3.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var8+"";
            InputStream var6;
            TestModels.TestResult var9;
            if (var3.getResponseCode() == 200) {
                (var9 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getInputStream()), TestModels.TestResult.class)).success = Boolean.TRUE;
                var6.close();
                return var9;
            } else {
                (var9 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getErrorStream()), TestModels.TestResult.class)).success = Boolean.FALSE;
                var6.close();
                return var9;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestResult verifyJoinObserver(TestModels.TestWatchRequest var1, String var2) {
        try {
            HttpURLConnection var3;
            (var3 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/game")).openConnection()).setRequestMethod("PUT");
            var3.setDoOutput(true);
            var3.addRequestProperty("Authorization", var2);
            var3.addRequestProperty("Accept", "application/json");
            String var5 = _157ea3b5e2134e129d3e8247875ae918((Object)var1);
            OutputStream var7 = var3.getOutputStream();
            _157ea3b5e2134e129d3e8247875ae918(var5, var7);
            var7.close();
            var3.connect();
            int var8 = var3.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var8+"";
            InputStream var6;
            TestModels.TestResult var9;
            if (var3.getResponseCode() == 200) {
                (var9 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getInputStream()), TestModels.TestResult.class)).success = Boolean.TRUE;
                var6.close();
                return var9;
            } else {
                (var9 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var6 = var3.getErrorStream()), TestModels.TestResult.class)).success = Boolean.FALSE;
                var6.close();
                return var9;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public TestModels.TestResult clear() {
        try {
            HttpURLConnection var1;
            System.out.println("this is the error I think?");
            System.out.println( "http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/db" );
            (var1 = (HttpURLConnection)(new URL("http://" + this._157ea3b5e2134e129d3e8247875ae918 + ":" + this._7a2c0ed700794f9a95fea387d1d303c0 + "/db")).openConnection()).setRequestMethod("DELETE");
            var1.setDoOutput(true);
            var1.addRequestProperty("Accept", "application/json");
            var1.connect();
            int var3 = var1.getResponseCode();
            this._157ea3b5e2134e129d3e8247875ae918 = var3+"";
            TestModels.TestResult var2;
            InputStream var5;
            if (var1.getResponseCode() == 200) {
                var jef = var1.getInputStream();
                //System.out.println("jef:",jef);
                (var2 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var1.getInputStream()), TestModels.TestResult.class)).success = Boolean.TRUE;
                var5.close();
                return var2;
            } else {
                (var2 = (TestModels.TestResult)_157ea3b5e2134e129d3e8247875ae918(_157ea3b5e2134e129d3e8247875ae918(var5 = var1.getErrorStream()), TestModels.TestResult.class)).success = Boolean.FALSE;
                var5.close();
                return var2;
            }
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String _157ea3b5e2134e129d3e8247875ae918(InputStream var0) throws IOException {
        StringBuilder var1 = new StringBuilder();
        InputStreamReader var4 = new InputStreamReader(var0);
        char[] var2 = new char[1024];

        int var3;
        while((var3 = var4.read(var2)) > 0) {
            var1.append(var2, 0, var3);
        }

        return var1.toString();
    }

    private static void _157ea3b5e2134e129d3e8247875ae918(String var0, OutputStream var1) throws IOException {
        OutputStreamWriter var2;
        (var2 = new OutputStreamWriter(var1)).write(var0);
        var2.flush();
    }

    private static String _157ea3b5e2134e129d3e8247875ae918(Object var0) {
        return (new Gson()).toJson(var0);
    }

    private static <T> T _157ea3b5e2134e129d3e8247875ae918(String var0, Class<T> var1) {
        return (new Gson()).fromJson(var0, var1);
    }
}
