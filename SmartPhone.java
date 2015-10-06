// 3. Представим, что в некоем абстрактном складском приложении смартфоны представлены классом SmartPhone. Содержит ли класс  SmartPhone какие либо ошибки?

/*
    1. hashCode всегда должна возвращать одно и то-же значение для одного и того-же объекта.
    2. equals может выкинуть NullPointerException если одно из свойств класса будет равно null.
    3. Ну и по мелочи. Можно добавить @Override к hashCode(), сделать поля private и заменить устаревший Date
*/

class SmartPhone {
    String model;
    Date date;
    String revision;

    public SmartPhone(String model, Date date, String revision) {
      model = model;
      date = date;
      revision = revision;
    }

    public int hashCode() {
      return new Random().nextInt();
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      SmartPhone that = (SmartPhone) o;

      if (!date.equals(that.date)) return false;
      if (!model.equals(that.model)) return false;
      if (!revision.equals(that.revision)) return false;

      return true;
    }
    /**
     * setters, getters and
     * some important methods
     *
     *
     */
  }