/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com;

import java.util.HashMap;
import java.util.Map;

/**
 * 需要咨询JAVA高级VIP课程的可以加嫦娥老师的QQ：2658342213
 * 需要视频资料或者咨询课程的可以加安其拉老师：2246092212
 * author：鲁班学院-商鞅老师
 */
public class TestObjcet {


  public  void test(String name){

  }

  @Override
  public int hashCode() {
    return 123;
  }

  @Override
  public boolean equals(Object obj) {
    return true;
  }

  public static void main(String[] args) throws Exception{

    TestObjcet testObjcet = new TestObjcet();
    TestObjcet testObjcet1 = new TestObjcet();
    System.out.println(testObjcet.equals(testObjcet1));
    System.out.println(testObjcet.hashCode());
    System.out.println(testObjcet1.hashCode());
    Map map = new HashMap();
    map.put(testObjcet,"1");

    System.out.println(map.get(testObjcet1));

  }
}
