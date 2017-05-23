var order = ['red', 'yellow', 'blue', 'green', 'red']
Page({
  data: {
    iconSize: [20, 30, 40, 50, 60, 70],
    iconColor: [
      'red', 'orange', 'yellow', 'green', 'rgb(0,255,255)', 'blue', 'purple'
    ],
    iconType: [
      'success', 'success_no_circle', 'info', 'warn', 'waiting', 'cancel', 'download', 'search', 'clear'
    ],
     imgUrls: [
      'http://oolhqclj2.bkt.clouddn.com/test1.jpg',
      'http://oolhqclj2.bkt.clouddn.com/test2.jpg',
      'http://oolhqclj2.bkt.clouddn.com/test3.jpg'
    ],
    indicatorDots: true,
    autoplay: false,
    interval: 5000,
    duration: 1000,
     list: [
      {
        id: 'view',
        name: '本地音乐',
        open: false,
      }, {
        id: 'content',
        name: '我喜欢的音乐',
        open: false,
        pages: ['一生所爱', '此时此刻', '蓝莲花']
      }, {
        id: 'form',
        name: '专辑',
        open: false,
        // pages: ['button', 'checkbox', 'form', 'input', 'label', 'picker', 'radio', 'slider', 'switch', 'textarea']
      }
    ]
  },
    changeIndicatorDots: function(e) {
    this.setData({
      indicatorDots: !this.data.indicatorDots
    })
  },
  changeAutoplay: function(e) {
    this.setData({
      autoplay: !this.data.autoplay
    })
  },
  intervalChange: function(e) {
    this.setData({
      interval: e.detail.value
    })
  },
  durationChange: function(e) {
    this.setData({
      duration: e.detail.value
    })
  },
  kindToggle: function (e) {
    var id = e.currentTarget.id, list = this.data.list;
    for (var i = 0, len = list.length; i < len; ++i) {
      if (list[i].id == id) {
        list[i].open = !list[i].open
      } else {
        list[i].open = false
      }
    }
    this.setData({
      list: list
    });
  }
})